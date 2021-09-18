package com.intellect.training.java.oops;

public class LowBalanceException extends Exception {
	
	String message;
	
	public LowBalanceException(String message) {
		
		this.message=message;
		
	}

	
	public String toString() {
		return message;
	}
	
	

}
