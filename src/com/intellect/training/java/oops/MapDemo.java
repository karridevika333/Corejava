package com.intellect.training.java.oops;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		Map map=new HashMap();
		
		map.put("10.10.10.10.10", "www.me.com");
		map.put("10.10.10.10.100", "www.i.com");
		map.put("10.10.10.10.101", "www.we.com");
		map.put("10.10.10.10.102", "www.you.com");
		
		System.out.println(map);
		
		
	}

}
