package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStringToInteger {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("1","2","3","4","5");
		
		List<Integer> listOfInteger = listOfStrings.stream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		System.out.println(listOfIntegers);
		
		
		List<String> listOfStrings1 = listOfInteger.stream()
				.map(Object::valueOf)
				.collect(Collectors.toList());
		
		System.out.println(listOfIntegers1);
		
	}

