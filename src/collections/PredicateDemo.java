package collections;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
	public static void main(String[] args) {
		
//		//takes one arguments and returns boolean value
//		
//		Predicate<Integer> predicate = i-> i>20;
//		System.out.println(predicate.test(30));
//		
//		
//		Supplier<Double> supplier= ()-> Math.random();
//		System.out.println(supplier.get());
//		
//		
//		//Function Interface
//		
//		Function<Integer,Integer>function = i->i/2;
//		System.out.println(function.apply(100));
//		
//		Function<Integer,Integer>function1 = i->i/2;
//		function1=function1.andThen(i->i*3);
//		System.out.println(function1.apply(100));
//		
		
//		predicate interface
		
		Predicate<Integer> p1 = a-> a%2==0;
		System.out.println(p1.test(101));
		Product product = new Product(100,"shoes",12.00);
		
		Predicate<Product> p2 = p->(p.id<50);
		
		System.out.println(p2.test(product));
		
		
		
		
		
		
		
	}

}
