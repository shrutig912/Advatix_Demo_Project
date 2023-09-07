package com.advatix.fedexrest.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.stream.Collectors;

public class ErrorHandler implements ResponseErrorHandler {
    Logger logger = LoggerFactory.getLogger(ErrorHandler.class);

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        String responseAsString = new BufferedReader(new InputStreamReader(response.getBody())).lines()
                .collect(Collectors.joining("\n"));
        logger.error("ResponseBody: {}", responseAsString);
        throw new CustomException(responseAsString);
    }

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return !response.getStatusCode().is2xxSuccessful();
    }

    @Override
    public void handleError(URI url, HttpMethod method, ClientHttpResponse response) throws IOException {
        String responseAsString = new BufferedReader(new InputStreamReader(response.getBody())).lines()
                .collect(Collectors.joining("\n"));
        logger.error("URL: {}, HttpMethod: {}, ResponseBody: {}", url, method, responseAsString);
        throw new CustomException(responseAsString);
    }

    static class CustomException extends IOException {
        private static final long serialVersionUID = 1L;

        public CustomException(String message) {
            super(message);
        }
    }
}