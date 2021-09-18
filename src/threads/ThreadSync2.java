package threads;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending\t"+ msg);
		try
		{
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n"+ msg +"sent");
	}
}
//class for send a message using threads
class ThreadedSend extends Thread
{
	private String msg;
	Sender sender;
	
	//receives a message object and a string 
	//message to be sent
	ThreadedSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
		
	}
	public void run()
{
	//only one thread can send a message
		//at a time.
		synchronized(sender)
		{
			sender.send(msg);
			
		}
   }
	
}


public class ThreadSync2 {
	public static void main(String[] args) {
		
		Sender snd = new Sender();
		
		ThreadedSend s1 = new ThreadedSend(" Hi ", snd);
		ThreadedSend s2 = new ThreadedSend(" Bye ", snd);
		
		//start two threads of threadedSend type
		s1.start();
		s2.start();
		
		//wait for threads to end
		
		try
		{
			s1.join();
			s2.join();
			
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
			
		}
	}

}
