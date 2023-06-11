package _100_days_of_java;

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=1,nextterm;
	    System.out.print("Enter number of terms to display :");
	    System.out.println();
	    int terms = sc.nextInt();
	    System.out.print(num1+" ");
	    System.out.print(num2+" ");
	    for(int i=1;i<=terms-2;i++) {
	    	nextterm = num1+num2;
	    	num1 = num2;
	    	num2 = nextterm;
	    	System.out.print(nextterm+" ");
	    }
	}
}