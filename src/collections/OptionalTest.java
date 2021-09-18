package collections;

import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer(1,null,"ad@v.com",Arrays.asList("676767","12344"));
		 
		Optional<Object>getName = Optional.empty();
		System.out.println(getName);
		
		
//		String s=customer.getName();
//		System.out.println(s);
		
		Optional<String>getName1 = Optional.of(customer.getName());
		System.out.println(getName1);
		
		
//		ofNullable = of() + empty()
		
		Optional<String>getName2 = Optional.ofNullable(customer.getName());
		System.out.println(getName2);
		
		
	}
	

}
