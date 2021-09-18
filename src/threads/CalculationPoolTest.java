package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Addition implements Runnable{
	

int a;
int b;
public Addition(int a, int b) {
	this.a =a;
	this.b =b;
	
}
public void run()
{
	int sum =a + b;
	System.out.println("sum: " +sum);
}
}

class Subtraction implements Runnable{
	int x;
	int y;
	public Subtraction(int x, int y) {
		this.x =x;
		this.y =y;
		
	}
	@Override
	public void run() {
		int sub = x-y;
		System.out.println("sub:" +sub);
		
	}
}

class Multiplication implements Runnable{
	int p;
	public Multiplication(int p) {
		this.p =p;
		
	}
		
	@Override
	public void run() {
		
		int multiply = p * p;
		System.out.println("multiply:" +multiply);
		
	}	
}

	
public class CalculationPoolTest {
	public static void main(String[] args) {
	
		//create a fixed thread pool with maximum one thread	
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		//submit tasks to the thread pool
		executor.execute(new Addition(25, 100));
		executor.execute(new Subtraction(10, 5));
		executor.execute(new Multiplication(5));
		
		//shut down the executor
		
		executor.shutdown();
		
		
	}

}




