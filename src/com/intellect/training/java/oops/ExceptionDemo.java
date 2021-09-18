package com.intellect.training.java.oops;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		int[] a = new int[2];
		
		try {
			System.out.println("hello");
			System.out.println("hi");
			System.out.println(a[1]);
			System.out.println(2/0);
			System.out.println("intellect");
			System.out.println("lol");
			
		}
		catch(NullPointerException e) {
			
			System.out.println(e);
			
		}
	}

}
