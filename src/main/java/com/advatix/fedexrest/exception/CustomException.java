package com.advatix.fedexrest.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends BaseException {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 3077468772228075912L;

    /**
     * The Constant DEFAULT_MESSAGE.
     */
    private static final String DEFAULT_MESSAGE = "Conflict !";

    /**
     * The Constant DEFAULT_HTTP_STATUS.
     */
    private static final HttpStatus DEFAULT_HTTP_STATUS = HttpStatus.CONFLICT;

    /**
     * Instantiates a new entity already exists exception.
     */
    public CustomException() {
        this(DEFAULT_HTTP_STATUS, DEFAULT_MESSAGE);
    }

    /**
     * Instantiates a new entity already exists exception.
     *
     * @param httpStatus   the http status
     * @param errorMessage the error message
     */
    public CustomException(HttpStatus httpStatus,
                           String errorMessage) {
        super(httpStatus, DEFAULT_HTTP_STATUS, errorMessage, DEFAULT_MESSAGE);
    }

    /**
     * Instantiates a new minimum order quantity required exception.
     *
     * @param errorMessage the error message
     */
    public CustomException(String errorMessage) {
        super(DEFAULT_HTTP_STATUS, errorMessage);
    }

}
