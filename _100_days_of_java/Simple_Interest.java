package _100_days_of_java;

import java.util.Scanner;
public class Simple_Interest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            float p, r, t, interest;
            System.out.print("Enter the Principal : ");
            p = sc.nextFloat();
            System.out.print("Enter the Rate of interest : ");
            r = sc.nextFloat();
            System.out.print("Enter the Time period : ");
            t = sc.nextFloat();
            interest = (p * r * t) / 100;
            System.out.print("Simple Interest is: " + interest);
	}
}