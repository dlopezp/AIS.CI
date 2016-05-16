package com.example;

public class Message {

	private String value;
	
	/*
		Constructor vacio para hacer la clase inyectable
	*/
	public Message() {}
	
	public Message (String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
