package collections;

import java.util.Arrays;
import java.util.List;

public class MatchingDemo {
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				
				new Person("abc",20),
				new Person("xyz",22),
				new Person("sujay ",23),
				new Person("ajay",24),
				new Person("vijay",25),
				new Person("jay",26)
				
				);
		
		boolean ageAbove20 =list.stream().allMatch( p-> p.getAge()>20);
		System.out.println(ageAbove20);
		
		boolean nameMatch =list.stream().allMatch( p-> p.name.equals("jay"));
		System.out.println(nameMatch);
		
		boolean nameAndAgeMatch =list.stream().allMatch( p-> p.getAge()==23 && p.name.equals("jay"));
		System.out.println(nameAndAgeMatch);
		
	}

}
