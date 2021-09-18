package iopackage;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * jdk1.5
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
