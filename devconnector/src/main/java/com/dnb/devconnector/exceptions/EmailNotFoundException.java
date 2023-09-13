package com.dnb.devconnector.exceptions;

public class EmailNotFoundException extends Exception{
	public EmailNotFoundException(String msg) {
		super(msg);
		}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+super.getMessage();
	}


}
