package com.intellect.training.java.oops;

import java.util.*;


public class SetDemo {
	public static void main(String[] args) {
		
	
		Set<Integer> set = new TreeSet<>();
		set .add(10);
		set.add(100);
		set.add(1000);
		set.add(10000);
		set.add(10000);
		
		System.out.println(set);
	}

}
