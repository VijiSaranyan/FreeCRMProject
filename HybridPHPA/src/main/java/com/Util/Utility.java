package com.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utility {
	
	public RequestSpecification requestdetails() throws IOException {
		
		RequestSpecification request= new RequestSpecBuilder().setBaseUri(getConfigValues("baseuri")).
																setContentType(ContentType.JSON).build();
		
		return request;
	}
	
	public static String getConfigValues(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Viji\\eclipse-workspace\\Java\\HybridPHPA\\src\\test\\resources\\properties\\config.properties");;
		prop.load(fis);
		return prop.getProperty(key);
		
	}

}
