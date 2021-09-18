package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class ExecutorsTest {
	public static void main(String[] args) {
		
		ExecutorService service = new Executors.newFixedThreadPool(10);
		
		for(int i=0; i<100; i++) {
			service.execute(new Task());
		}
	}

}
