package threads;

import java.util.concurrent.RecursiveTask;

public class SearchElements extends RecursiveTask{
	int arr[];
	int start,end,searchElement;
	
	
	@Override
	protected Integer compute() {
		
		return processSearch();
	}


	private Integer processSearch() {
		
		int count=0;
		for(int i=start; i <end; i++) {
			if(arr[i]== searchElement) {
				count++;
			}
		}
		
		
		return count++;
	}


	public SearchElements(int[] arr, int start, int end, int searchElement) {
		super();
		this.arr = arr;
		this.start = start;
		this.end = end;
		this.searchElement = searchElement;
	}
	
	

}
