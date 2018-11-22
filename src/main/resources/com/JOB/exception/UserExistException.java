package com.JOB.exception;

public class UserExistException extends Exception{
	public UserExistException() {
		
	}
	public UserExistException(String errormessage) {
		super(errormessage);
	}
}
