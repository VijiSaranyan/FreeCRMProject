package com.Data;

import org.testng.annotations.Test;

import com.Pojo.Pojo;

public class SetValues_pojo_post {
	
	public Pojo setvalues() {
		
		Pojo p=new Pojo();
		p.setTitle("Apple");
		p.setBody("Fruits");
		p.setAuthor("Viji");		
		return p;
		
	
	}
public Pojo setvalues_post(String title,String body,String author) {
		
		Pojo p=new Pojo();
		p.setTitle(title);
		p.setBody(body);
		p.setAuthor(author);		
		return p;
		
	
	}
	
}