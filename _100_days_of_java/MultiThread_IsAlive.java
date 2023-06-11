package _100_days_of_java;

public class MultiThread_IsAlive extends Thread {
	 public void run()  
	    {  
	        try  
	        {  
	            Thread.sleep(300);  
	            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
	        }  
	        catch (InterruptedException ie) {  
	        }  
	    }  
	    public static void main(String[] args)  
	    {  
	    	MultiThread_IsAlive thread1 = new MultiThread_IsAlive();  
	        System.out.println("before starting thread isAlive: "+thread1.isAlive());  
	        thread1.start();  
	        System.out.println("after starting thread isAlive: "+thread1.isAlive());  
	    } 
}