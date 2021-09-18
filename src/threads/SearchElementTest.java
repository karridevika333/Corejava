package threads;

import java.util.concurrent.ForkJoinPool;

public class SearchElementTest {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int searchElement = 3;
		int start =0;
		int end = arr.length -1;
		
		ForkJoinPool pool= ForkJoinPool.commonPool();
		SearchElements seaElement = new SearchElements(arr, start, end,searchElement);
		int result =  (int) pool.invoke(seaElement);
		System.out.println(searchElement + "found"+result+"times");
	}

}
