package _100_days_of_java;

public class Number_Odd_Times {
	 int getOddTimesElement(int ar[]) 
	    {
	        int i;
	        int result = 0;
	        for (i = 0; i < ar.length; i++) 
	        {
	            // XOR operation
	            result = result ^ ar[i];
	        }
	        return result;
	    }
	 
	    public static void main(String[] args) 
	    {
	        Number_Odd_Times occur = new Number_Odd_Times();
	        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
	        System.out.println("Number which occurs odd number of times is : "+occur.getOddTimesElement(array));
	    }
}