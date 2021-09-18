package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
	public static void main(String[] args) {
		
		ArrayList<Employees> emp1 = new ArrayList<>();
		
		emp1.add(new Employees(100,"ajay",12));
		emp1.add(new Employees(101,"jay",22));
		emp1.add(new Employees(102,"vijay",121));
		emp1.add(new Employees(103,"sajay",15));
		
		System.out.println("compare using ID");
		Collections.sort(emp1,new IDComparator());
		for(Employees e:emp1) {
			System.out.println(e);
			
			
		
		
		
			
			
		}
	}

}
