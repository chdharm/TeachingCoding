package Basics;
public class ThreadUsingRunnable implements Runnable{
	@Override
	public void run()
	{
	System.out.println("Run method");
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	}
	
	public static void main(String[] args){
		ThreadUsingRunnable a1=new ThreadUsingRunnable();
		//ThreadUsingRunnable a2=new ThreadUsingRunnable();
		Thread a2=new Thread(a1);
		Thread a3=new Thread(a1);
		a2.start();
		a3.start(); 
		//a1.run();    //fine, but does not start a separate call stack  
		//a2.run();
		//new Thread(a1).start();


	
	}

}
