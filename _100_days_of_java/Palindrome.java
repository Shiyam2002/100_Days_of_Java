package _100_days_of_java;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String revstr="";
		int len = str.length();
		
		
		for(int i=len-1;i>=0;i--) {
			revstr = revstr + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(revstr)) {
			System.out.println(str+" is a Palindrome");
		}
		else {
			System.out.println(str+" is not a Palindrome");
		}
	}
}