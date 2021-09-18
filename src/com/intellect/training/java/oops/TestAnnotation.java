package com.intellect.training.java.oops;

import java.lang.reflect.Method;


@Re

public class TestAnnotation {
	public static void main(String[] args) {
		Hello h=new Hello();
		Method m=h.getClass().getMethod("sayhello");
		
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
		System.out.println("value is:"+manno.value());
	}

}
