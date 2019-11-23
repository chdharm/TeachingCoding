package Basics;
public class ThreadUsingExtend extends Thread {
	public void run()
	{
		System.out.println("run method started");
		for(int i=0;i<=10;i++)
		{
			System.out.println("good morning");
			try
			{
			Thread.sleep(500);	
			}
			catch(Exception e)
			{
				
			}
		}

		System.out.println("run method ended");
	}
	
	
	public static void main(String[] args)   
	{
		ThreadUsingExtend a1=new ThreadUsingExtend ();
		a1.start();
		

	}

}
