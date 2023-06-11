package _100_days_of_java;

public class MultiThread_Creation implements Runnable {
	
	 String message;
	public MultiThread_Creation(String msg) {
		message = msg;
	}
	
	public void run()
    {
          for(int count=0;count<=5;count++)
          {
                try
                {
                      System.out.println("Run method: " + message);
                      Thread.sleep(100);
                }
                catch (InterruptedException ie)
                {
                      System.out.println("Exception in thread: "+ie.getMessage());
                }
          }
    }
	public static void main(String[] args) {
		 MultiThread_Creation obj1 = new MultiThread_Creation("MyThread obj1");
		 MultiThread_Creation obj2 = new MultiThread_Creation("MyThread obj2");
         Thread t1 = new Thread(obj1);
         Thread t2 = new Thread(obj2);
         t1.start();
         t2.start();
	}
}