package threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SearchTask extends RecursiveTask<Integer>{
	private static final long serialVersionUID =1L;
	int array[];
	int start,end;
	int searchElement;
	public SearchTask(int[] arrary, int start, int end, int searchElement) {
		super();
		this.array = arrary;
		this.start = start;
		this.end = end;
		this.searchElement = searchElement;
	}
	
	protected Integer compute() {
	System.out.println(Thread.currentThread());
	int size = end - start + 1;
	if(size>3) {
		int midPoint = (start + end)/2;
		SearchTask task1 = new SearchTask(array, start, midPoint, searchElement);
		SearchTask task2 = new SearchTask(array, midPoint +1, end, searchElement);
		task1.fork();
		task2.fork();
		int result = task1.join() + task2.join();
		return result;
	}else {
		return processSearch();
		
	}
	}
	private Integer processSearch() {
		
		int count = 0;
		for(int i=start; i<=end; i++) {
			if(array[i]==searchElement) {
				count++;
				
			}
		}
		return count;
		
	}
}

public class ForkAndJoinTest {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,5,11,12,5,14,15,16,17,18};
		int searchElement = 5;
		int start = 0;
		int end = arr.length -1;
		
		ForkJoinPool pool = ForkJoinPool.commonPool();
		SearchTask task = new SearchTask(arr, start, end, searchElement);
		int result = pool.invoke(task);
		System.out.println("Search Element is:"+ searchElement +" found "+ result);
	}

}
