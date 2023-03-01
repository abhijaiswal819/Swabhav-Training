package com.aurionpro.model;

public class InsufficientBalanceException extends RuntimeException {

	String message = "";

	public InsufficientBalanceException(String msg) {
		this.message=msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
