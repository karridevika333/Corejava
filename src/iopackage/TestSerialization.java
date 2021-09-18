package iopackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) {
		try {
			//creating the object
			
			Student s1 = new Student(101,"ajay");
			//creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("abc.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			//closing the stream
			out.close();
			System.out.println("success");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
