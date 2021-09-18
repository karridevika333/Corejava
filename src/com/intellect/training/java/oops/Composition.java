package com.intellect.training.java.oops;

import java.util.ArrayList;

class Z
@Deprecated
void m1(){
	System.out.println("hi");
}

class Y extends Z{
	@Override
	void m1() {
		System.out.println("hello");
	}
}


public class Composition {
	public static void main(String[] args) {
		
	@SuppressWarnings("rawtypes")
	ArrayList al= new ArrayList();
	
		}
		
		Person person = new Person();
		
		person.setId(100);
		person.setFirstName("Karri");
		
		person.setLasttName("Devika");
		person.getAddress().setAddressline1("aaa");
		person.getAddress().setAddressline2("lane3");
		person.getAddress().setStreet("10");
		person.getAddress().setCity("pondy");
		
		
		System.out.println(person);
		person = null;
		
		System.out.println(person);
		if (person!=null)
			System.out.println(person.getAddress());
		else
			System.out.println("no address");
		
		System.out.println(person);
		person = null;
			
		
		
		
	}

}
