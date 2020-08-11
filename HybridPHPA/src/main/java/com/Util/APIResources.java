package com.Util;

public enum APIResources {
	//enum class is static which means we cannot change the values
		
		postapi("api/insert.php"),
		putapi("api/update.php"),
		deleteapi("api/delete.php"),
		getapi("api/read.php"),
		getapiid("api/read.php?id=1");
		 String resource;
		
	APIResources(String resource) {
		this.resource=resource;
		
	}

	public String getResource() {
		return resource;
	}
	}



