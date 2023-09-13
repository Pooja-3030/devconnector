package com.dnb.devconnector.exceptions;

public class InvalidMailException extends Exception  {
	public InvalidMailException(String msg) {
		super(msg);
		}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+super.getMessage();
	}

}
