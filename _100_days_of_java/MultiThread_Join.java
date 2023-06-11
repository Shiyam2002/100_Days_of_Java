package _100_days_of_java;

public class MultiThread_Join extends Thread {
	
	public void run() {
		for(int i=1; i<=4; i++)  
        {    
            try 
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
	}

	public static void main(String[] args) {
		MultiThread_Join thr1 = new MultiThread_Join();
		MultiThread_Join thr2 = new MultiThread_Join();
		MultiThread_Join thr3 = new MultiThread_Join();
		thr1.start();
		try {
			thr1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		thr2.start();
		thr3.start();
	}
}