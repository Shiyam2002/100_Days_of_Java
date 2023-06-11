package _100_days_of_java;

public class MultiThread_Yield extends Thread {
	 public void run()  
	    {  
	        for (int i=0; i<3 ; i++)  
	            System.out.println(Thread.currentThread().getName() + " in control");  
	    }  
	    public static void main(String[]args)  
	    {  
	    	MultiThread_Yield thread1 = new MultiThread_Yield();  
	    	MultiThread_Yield thread2 = new MultiThread_Yield();  
	        thread1.start();  
	        thread2.start();  
	        for (int i=0; i<3; i++)  
	        {  
	            thread1.yield();  
	            System.out.println(Thread.currentThread().getName() + " in control");  
	        }  
	    }  
}