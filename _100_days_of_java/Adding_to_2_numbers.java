package _100_days_of_java;

import java.util.Scanner;
public class Adding_to_2_numbers {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 ,num2,result=0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 + num2 ;
		System.out.println("Sum of Two given numbers is : "+result);
	}
}