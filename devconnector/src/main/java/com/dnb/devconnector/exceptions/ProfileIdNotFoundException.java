package com.dnb.devconnector.exceptions;

public class ProfileIdNotFoundException extends Exception {
	public ProfileIdNotFoundException(String msg) {
		super(msg);
		}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+super.getMessage();
	}


}
