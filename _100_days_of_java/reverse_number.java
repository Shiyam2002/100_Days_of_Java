package _100_days_of_java;

import java.util.Scanner;
public class reverse_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), reversed = 0;
	    System.out.println("Original Number: " + num);
	    while(num != 0) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }
	    System.out.println("Reversed Number: " + reversed);
	}
}