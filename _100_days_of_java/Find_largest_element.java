package _100_days_of_java;

import java.util.Scanner;
public class Find_largest_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int a:arr) {
			arr[a]=sc.nextInt();
		}
		int large = arr[0];
		
		for(int num:arr) {
			if(large <num)
				large = num;
		}
		System.out.println("The largest Element is : "+large);
		sc.close();
	}
}