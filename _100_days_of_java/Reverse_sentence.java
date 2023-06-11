package _100_days_of_java;

import java.util.Scanner;
public class Reverse_sentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String revstr = reverse(str);
		System.out.println("The Reverse String is "+revstr);
		sc.close();
	}
	
	public static String reverse(String str) {
		if(str.isEmpty())
		return str;
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
}