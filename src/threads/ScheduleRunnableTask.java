package threads;

import java.util.Date;

public class ScheduleRunnableTask implements Runnable {
	private String taskName;
	public ScheduleRunnableTask(String s) {
		this.taskName= s;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"start Time for "+taskName+""+new Date());
	
	//process task here
		
		try {
			Thread.sleep(5000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"End Time for "+taskName+""+new Date());
	}
	@Override
	public String toString() {
		return this.taskName;
	}

	

}
