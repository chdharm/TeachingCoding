package Basics;
public class ThreadJoins extends Thread {
	public void run()
	{
		System.out.println("Run method");
	for(int i=0;i<=10;i++)	
	{
		System.out.println(i);	
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			
		}
	}	
	}
	public static void main(String[] args) {
		 ThreadJoins t1=new  ThreadJoins();
		 ThreadJoins t2=new  ThreadJoins();
		 ThreadJoins t3=new  ThreadJoins();
		 t1.start();
		 try
		 {
			 t1.join(500);
		
		 }
		 catch(Exception e)
		 {
		
		 }
			t2.start();
			t3.start();
	}
}
