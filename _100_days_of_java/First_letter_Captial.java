package _100_days_of_java;

import java.util.Scanner;
public class First_letter_Captial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String first = str.substring(0, 1);
		String remain = str.substring(1, str.length());
		
		first = first.toUpperCase();
		str = first+remain;
		System.out.println(str);
	}
}