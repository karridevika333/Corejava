package collections;

import java.util.Comparator;

public class Employees {
	
	int id;
	String name;
	int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employees(int id, String name, int age) {
		super();
		this.id=id;
		this.name=name;
		this.salary =salary;
		
		
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
//
//class NameComparator implements Comparator<Employees>{
//	
//	public int compare(Employees e1, Employees e2) {
//		
//		return e1.name.compareTo(e2.name);
//		
//		
//	}
//}
//
//class AgesComparator implements Comparator<Employees>{
//	
//	public int compare(Employees e1, Employees e2) {
//		
//		if (e1.age == e2.age) {
//			return 0;
//			
//			
//		}
//		else if(e1.age >e2.age) {
//		return 1;
//	    }
//	     else
//	    	 
//		return -1;
//	
//	
//		
//	}
//}
//
//
//class IDComparator implements Comparator<Employees>{
//	
//	public int compare(Employees e1, Employees e2) {
//		
//		if (e1.id == e2.id) {
//			return 0;
//			
//			
//		}
//		else if(e1.id >e2.id) {
//		return 1;
//	    }
//	     else
//	    	 
//		return -1;
//	}
//}