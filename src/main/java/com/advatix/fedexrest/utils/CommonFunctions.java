package com.advatix.fedexrest.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Vishal Choudhary 
 * Created On 08-06-2022
 */

public class CommonFunctions {

	public static String objectToJson(Object obj) {
		ObjectMapper mapperObj = new ObjectMapper();
		String jsonInString = "";
		try {
			jsonInString = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			jsonInString = "NULL";
		}
		return jsonInString;
	}
}
