package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(100,"shirt",1200.00d));
		list.add(new Product(101,"shoes",1400.00d));
		list.add(new Product(102,"pants",1500.00d));
		list.add(new Product(103,"mobile",1600.00d));
		list.add(new Product(10,"mobil",1600.00d));
		
		list.stream().filter(p -> p.id>101).forEach(System.out::println);
		
		List<String> string = Arrays.asList("one","two","three","four");
		List<String> s1 = string.stream().filter(s -> s.length()>3).collect(Collectors.toList());
		System.out.println(s1);
		
		
		
	}

}
