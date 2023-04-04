package com.advatix.freightclub.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class WebhookCreation {
	private static final Logger logger = LoggerFactory.getLogger(WebhookCreation.class);

	@Autowired
	private Environment environment;

	@PostConstruct
	public void init() {
		logger.info("Initialisation of the Carrier India  Callbacks, {}",environment.getDefaultProfiles().toString());
	}
}
