package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadLoopTask {
public static void main(String[] args) {
	
	ExecutorService es= Executors.newSingleThreadExecutor();
	
	for(int i= 1; i<=3; i++) {
		LoopTask loopTask = new LoopTask("LoopTask"+i);
		es.submit(loopTask);
		
	}
	es.shutdown();
}}