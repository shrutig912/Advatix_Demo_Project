package com.advatix.fedexrest.utils;

import org.springframework.stereotype.Service;

@Service
public interface CommonConstants {

	 public static String DHL_EXPRESS = "DHLEXPRESS";

	/**
	 * Request Status Codes
	 */
	public static final int REQUEST_SUCCESS = 200;

	public static final int RECORD_EXISTS = 201;

	public static final int RECORD_NOT_EXISTS = 202;

	public static final int REQUEST_FAILED = 400;

	public static final int INVALID_REQUEST = 401;

	
}
