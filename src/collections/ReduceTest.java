package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceTest {
	
	public static void main(String[] args) {
		
		Integer sum = Stream.of(1,2,3,4).reduce(0,(a,b) -> a+b);
		System.out.println(sum);
		
//		sequential programming
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		int sum1=0;
		for(Integer i:list) {
			sum1 = sum1+i;
			System.out.println(sum1);
			
		}
		
//		concurent programming using stream(functional programming) approach1
		
		int sum2= list.stream().mapToInt(i ->i).sum();
		System.out.println(sum2);

		
//		approach2
		
		int sum3= list.stream().mapToInt(Integer:: intValue).sum();
		System.out.println(sum3);
		
//		approach3 using reduce
		Integer sum4= list.stream().reduce(0,(a,b)-> a+b);
		System.out.println(sum4);
		
		
//		app4 optimizing the code
		
		Optional<Integer> sum5= list.stream().reduce(Integer::sum);
		System.out.println(sum5);
		
		
//		finding the max value
		
		Integer maxValue= list.parallelStream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(maxValue);
		
//		finding the min value
		
		Integer minValue= list.parallelStream().reduce(1,(a,b)->a<b?a:b);
		System.out.println(minValue);
		
		List<String> list1 = Arrays.asList("c","c++","Python","javaScript","java");
		String largest = list1.parallelStream().
				reduce((word1,word2)-> word1.length()> word2.length()?word1:word2).get();
		System.out.println(largest);
		
		
		
		
		
		
	}

}
