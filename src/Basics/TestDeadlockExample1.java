package Basics;
public class TestDeadlockExample1 {  
	  public static void main(String[] args) {  
	    final String s1 = "ratan jaiswal";  
	    final String s2 = "vimal jaiswal";  
	    // t1 tries to lock resource1 then resource2  
	    Thread t1 = new Thread()
	    {  
	      public void run() 
	      {  
	          synchronized (s1) 
	          {  
	           System.out.println("Thread 1: locked resource 1");  
	  
	           try 
	           { 
	        	   Thread.sleep(100);
	        	   } 
	           catch (Exception e)
	           {
	        		   
	           }  
	  
	           synchronized (s2)
	           {  
	            System.out.println("Thread 1: locked ajit  s2");  
	           }  
	         }  
	      }  
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() 
	    {  
	      public void run()
	      {  
	        synchronized (s2)
	        {  
	          System.out.println("Thread 2: locked s2");  
	  
	          try 
	          { 
	        	  Thread.sleep(100);
	          } 
	          catch (Exception e) 
	          {
	        	  
	          }  
	  
	          synchronized (s1) 
	          {  
	            System.out.println("Thread 2: locked  s1");  
	          }  
	        }  
	      }  
	    };   
	    t1.start();  
	    t2.start();  
	  }  
	}  
	   