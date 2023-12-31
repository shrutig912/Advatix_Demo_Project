
package com.advatix.freightclub.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonDateTimeAmPmSerializer extends JsonSerializer<Date> {

	//private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
	
	@Override
	public void serialize(Date date, JsonGenerator generator, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		
		String formattedDate = dateFormat.format(date);
		
		generator.writeString(formattedDate);
	}

}
