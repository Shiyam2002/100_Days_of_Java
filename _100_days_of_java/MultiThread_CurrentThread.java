package _100_days_of_java;

public class MultiThread_CurrentThread extends Thread {
        public void run()
	    {    
	        System.out.println(Thread.currentThread().getName());    
	    }    
	    public static void main(String args[])  
	    {    
	    	MultiThread_CurrentThread thread1=new MultiThread_CurrentThread();    
	    	MultiThread_CurrentThread thread2=new MultiThread_CurrentThread();    
	        thread1.start();    
	        thread2.start();    
	    }    
}