package collections;

import java.util.*;
import java.io.*;

class Student implements Comparable<Students>{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		
	}
	public int compareTo(Students st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
		
	}
	
}

public class ComparableTest{
	public static void main(String[] args) {
		
ArrayList<Students> a1 = new ArrayList<Students>();
		
		a1.add(new Students(100,"ajay",12));
		a1.add(new Students(101,"jay",22));
		a1.add(new Students(102,"vijay",121));
		a1.add(new Students(103,"sajay",15));
		
		
		Collections.sort(a1);
		for(Students st:a1) {
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
	
	}
}

