package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		
		String[] string = new String[] {"one","two","three","four"};
		
		Stream<String> stream1= Arrays.stream(string);
		stream1.forEach(System.out::println);
		//2

		Stream<String> stream2= Stream.of("one","two","three");
			
		stream2.forEach(System.out::println);
		
		//3 method
		
		List<Product> list= new ArrayList<>();
		list.add(new Product(100,"shirt",1200.00d));
		list.add(new Product(101,"shoes",1400.00d));
		list.add(new Product(102,"pants",1500.00d));
		
	
		
		Stream<Product> stream3= list.stream();
		Stream<Product> stream4= stream3.distinct();//intermediate operation
		long count = stream4.count();//terminal operation
		
		System.out.println(count);
		
		long count1 = list.stream().distinct().count();//method chainig
		
		
		
		
	}

}
