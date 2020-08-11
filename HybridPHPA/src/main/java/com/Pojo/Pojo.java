package com.Pojo;

public class Pojo {
  private String title;
  private String body;
  private String author;
  private String id;
 
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Pojo() {
	
	this.title = title;
	this.body = body;
	this.author = author;
	this.id=id;
}
 
}
