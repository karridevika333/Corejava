package threads;

import threads.FoodDelivery.Thread1;
import threads.FoodDelivery.Thread2;

public class FoodDelivery {
	int i;
	boolean flag = false;
	
	//flag will be true when data production is over 
	
	synchronized void deliver(int i) {
		
		if(flag)try {
			wait();
			
			//wait till a notification is received from thread2. there will be no wastage of time
		}
		
		catch(InterruptedException ie) 
		{
			System.out.println(ie);
		}
		this.i =i; flag = true;
		
		
		//when data production is over, it will store true into flag.
		System.out.println("Data Delivered:" +i);
		notify();
		
		//when data production is over, it will notify thread2 to use it.
		
	}
	
	synchronized int receive() {
		if(!flag)
			
			try {
				wait();
				
			}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		System.out.println("Data Received:"+ i);
	flag = false;
	notify();
	return i;
	
	
	}
	
class Thread1 extends Thread{
	FoodDelivery obj;
	Thread1(FoodDelivery obj){
		this.obj = obj;
		
	}
	
	public void run() {
		for(int j =1; j<= 5; j++) {
			obj.deliver(j);
		}
	}
}

class Thread2 extends Thread{
	FoodDelivery obj;
	Thread2(FoodDelivery obj){
		this.obj = obj;
       }
	public void run() {
		for(int k =1; k<= 5; k++) {
			obj.receive();
		}
	}
    
}

public  class InterThread{
	public static void main(String[] args) {
		
		FoodDelivery obj = new FoodDelivery();
		
		//creating two thread
		Thread1 t1 = new Thread1(obj);
		
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
		
		
		
	}
	
}}