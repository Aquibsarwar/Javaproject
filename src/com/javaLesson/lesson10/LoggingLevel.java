package com.javaLesson.lesson10;

public enum LoggingLevel {

	PENDING(1, ""), PROCESSING(2, ""), PROCESSED(3, "");

	private int i;
	private String s;
	
	private LoggingLevel(int i, String s){
		this.i = i;
		this.s = s;
 	}

	public int code() {
		return i;
	}

}