package _100_days_of_java;

import java.util.Scanner;
public class Leap_Year {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 boolean leap = false;
		 
		 if(num % 4 == 0) {
			 if(num % 100 == 0) {
				 if(num % 400 == 0) {
					 leap = true;
				 }
				 else {
					 leap = false;
				 }
			 }
			 else {
				 leap = true;
			 }
		 }
		 else {
			 leap = false;
		 }
		 
		 if(leap)
			 System.out.println(num+" is a leap year");
		 else
			 System.out.println(num+" is not a leap year");
	}
}