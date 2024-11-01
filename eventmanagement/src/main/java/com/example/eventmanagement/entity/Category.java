package com.example.eventmanagement.entity;

public class Category {
 private Long id;
 private String name;
 private String descrpition;
 private Long event_id;
 
public Category() {
	super();
}
public Category(Long id,String name, String descrpition, Long event_id) {
	super();
	this.id= id;
	this.name = name;
	this.descrpition = descrpition;
	this.event_id = event_id;
}
public Long getid() {
	return id;
}
public String getName() {
	return name;
}
public void setid(Long id) {
	this.id= id;
}
public void setName(String name) {
	this.name = name;
}
public String getDescrpition() {
	return descrpition;
}
public void setDescrpition(String descrpition) {
	this.descrpition = descrpition;
}
public Long getEvent_id() {
	return event_id;
}
public void setEvent_id(Long event_id) {
	this.event_id = event_id;
}
}
