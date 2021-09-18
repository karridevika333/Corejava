package com.intellect.training.java.oops;

public class Outer {
	int id=100;
	void show() {
		System.out.println("I am outer class"+id);
		
	}
	
	class Inner{
		String name = "vijay";
		
		void display() {
			System.out.println("i am inner class"+name);
			show();
			System.out.println(id);
		}
		
	}
	
	public static void main(String[] args) {
		Outer o=new Outer();
		Inner i=o.new Inner();
		i.display();
	}
	

}
