package threads;

class MyThread extends Thread{
	
	public void run() {
	
	for(int i=0;i<5;i++) {
		System.out.println("Thread is running" +i);
	}
	
}

}

class MyThread3 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread2 is running" +i);
		}
		
	}
}

 class ThreadTest {
	public static void main(String[] args) {
		
		MyThread t1 =new MyThread();
		t1.start();
		
		MyThread3 myThread3=new MyThread3();
		Thread t2 = new Thread(myThread3);
		t2.start();
		
		
		
	}

	
}
