package com.example;

public class Message {

	private String value;
	
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
	
	public String getYellValue() {
		return this.value.toUpperCase();
	}
	
	public String getYellValue2() {
		return this.value.toUpperCase();
	}
}
