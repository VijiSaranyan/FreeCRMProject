package com.Data;

import org.testng.annotations.Test;

public class Payloads_Details {
		public static String postpayload()
		{
		return "{\r\n" + 
				"         \"title\": \"VijiREST_API\",\r\n" + 
				"        \"body\": \"QA -AGAMA\",\r\n" + 
				"        \"author\": \"VIJI\"\r\n" + 
				"    } \r\n" + 
				"";
				
	}
		public static String putpayload()
		{
			return"{\"id\":\"161\",\r\n" + 
					"\"author\":\"VIJI34\"\r\n" + 
					"}\r\n"+
					"";
		}
		
		public static String deletepayload()
		{
			return"{\"id\":161}";
		}

}
