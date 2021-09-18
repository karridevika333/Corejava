package threads;

public class LoopTask implements Runnable{
	
	private String loopTaskName;
	public LoopTask(String loopTaskName) {
		super();
		this.loopTaskName = loopTaskName;
		
	}
public void run() {
	System.out.println("starting "+ loopTaskName);
	for(int i= 1; i<=10; i++) {
		System.out.println("Executing"+ loopTaskName+ "with"+ Thread.currentThread());
	}
	System.out.println("Ending"+ loopTaskName);
}
}
