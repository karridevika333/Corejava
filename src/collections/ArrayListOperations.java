package collections;

import java.util.ArrayList;

public class ArrayListOperations {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList.contains("E"));
		System.out.println(arrayList.get(3));
		
		
	}

}
