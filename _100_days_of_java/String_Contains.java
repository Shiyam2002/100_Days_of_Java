package _100_days_of_java;

import java.util.Scanner;
public class String_Contains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line ");
		String line = sc.next();
		System.out.println("Enter the first word to check ");
		String str1 = sc.next();
		System.out.println("Enter the second word to check ");
		String str2 = sc.next();
		
		boolean result = line.contains(str1);
		if(result) {
			System.out.println(str1+" is present in "+line);
		}
		else {
			System.out.println(str1+" is not present in "+line);
		}
		
		int ans = line.indexOf(str2);
		if(ans==-1) {
			System.out.println(str2+" is not present in "+line);
		}
		else {
			System.out.println(str2+" is present in "+line);
		}
	}
}