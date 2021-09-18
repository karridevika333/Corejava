package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerData {
	
	static List<Customer>getAll(){
		
		return Stream.of(
				
				new Customer(100,"vijay","a@b.com",Arrays.asList("7676767","989898")),
				new Customer(101,"jay","d@b.com",Arrays.asList("76762323","233989898")),
				new Customer(102,"ajay","c@b.com",Arrays.asList("7676766767","9676989898")),
				new Customer(103,"sujay","b@b.com",Arrays.asList("457676767","9898232398"))
				
				
				).collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		List<Customer> customerList = CustomerData.getAll();
		
		
		//getting emails of customers
		
		List<String> emails = customerList.stream()
				.map(cust ->cust.getEmail())
				.collect(Collectors.toList());
		
		System.out.println(emails);
		

		
		//		Phonenumbers of customers
		
		List<List<String>> phoneNumbers = customerList.stream()
				.map(cust ->cust.getPhonenumbers())
				.collect(Collectors.toList());
		
		System.out.println(phoneNumbers);
		

		
		//		flattering the stream of stream
		
		

		List<String>newPhoneNumbers = customerList.stream()
				.flatMap(cust ->cust.getPhonenumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(newPhoneNumbers);
		
		
		
		
		
		
		
		
		
	}

}
