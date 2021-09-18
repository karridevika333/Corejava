package threads;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleRunnableMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Current Time="+ new Date());
		
		//created scheduledThreadPoolExecutor object
		
		
		
		ScheduledExecutorService scheduleThreadPool = Executors.newScheduledThreadPool(3); ;
		for(int i=1; i<=3; i++) {
			Thread.sleep(2000);
			ScheduleRunnableTask task = new ScheduleRunnableTask("Task"+i);
			scheduleThreadPool.scheduleWithFixedDelay(task, 5, 10, TimeUnit.SECONDS);
			
			//5(long delay) is the time period after which thread willbe execu
			// Time Unit can be seconds, minutes, hours,days and so on..
		}
		//Adding some dela
		Thread.sleep(35000);
		
		scheduleThreadPool.shutdown();
		System.out.println("Completed all threads");
		
	}

}
