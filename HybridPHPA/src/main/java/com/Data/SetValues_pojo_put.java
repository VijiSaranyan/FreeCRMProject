package com.Data;

import com.Pojo.Pojo;

public class SetValues_pojo_put {
	public Pojo putvalues()
	{
		Pojo p=new Pojo();
		
		p.setAuthor("Viji");
		p.setId("937");
		
		return p;
	}
	
	public Pojo putvalues(String id,String author)
	{
		Pojo p=new Pojo();
		
		p.setId(id);
		p.setAuthor(author);
		
		return p;
	}

}
