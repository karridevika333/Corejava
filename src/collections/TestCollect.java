package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCollect {
	public static void main(String[] args) {
		
		
		
		List<String> listOfString = Arrays.asList("Java", "c", "C++", "Go","javaScript","Python","Scala");
		System.out.println("input list of String:"+ listOfString);
		
		// ex 1: converting  stream to list using collect()method
		List<String> listOfStringStartWithJ = (List<String>) listOfString.stream().filter(s -> s.startsWith("J"));
		System.out.println("list of String starts with letter J: " +listOfStringStartWithJ);
		
		// ex 2: conv Stream to Set
		Set<String> setOfStringStartsWithC = (Set<String>) listOfString.stream().filter(s -> s.startsWith("C")); 
		System.out.println("set of String starts with letter C: " + setOfStringStartsWithC);
		
		//ex 3: con Stream to Map
		Map<String, Integer> stringToLength = listOfString.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("map of string and their length:"+ stringToLength);
		
		//ex: con Stream to Collection e.g. ArrayList
		
		ArrayList<String> stringWithLengthGreaterThanTwo = listOfString.stream()
				.filter(s -> s.length() > 2)
				.collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println("collection of string with length greater than 2:" + stringWithLengthGreaterThanTwo );
		
	}

}
