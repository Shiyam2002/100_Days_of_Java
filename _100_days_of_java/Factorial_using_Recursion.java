package _100_days_of_java;

public class Factorial_using_Recursion {
	 public static void main(String[] args) {
	        int num = 5;
	        if(num>0) {
	        	long factorial = Multiply(num);
	        	System.out.println("Factorial of " + num + " = " + factorial);
	        }
	        else {
	        	System.out.println("Factorial of negative numbers is not defined");
	        }
	    }
	    public static long Multiply(int num)
	    {
	        if (num >= 1)
	            return num * Multiply(num - 1);
	        else
	            return 1;
	    }
}