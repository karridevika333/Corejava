package com.intellect.training.java.oops;

public class TestCustomerException {
	
	public static void main(String[] args) {
		
		int balance = 1000;
		
		try {
			
			if (balance<5000) {
				
				throw new LowBalanceException("Balance is less than 5000");
				
			}
		}catch(LowBalanceException e) {
			System.out.println(e);
		}
	}

}
