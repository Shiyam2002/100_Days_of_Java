package _100_days_of_java;

import java.util.Scanner;
public class String_Substring_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 if(str.substring(0, str.length()/2).equals(str.substring(str.length()/2+1, str.length()))) {
			 System.out.println("YES");
		 }
		 else {
			 System.out.println("NO");
		 }  
	}
}