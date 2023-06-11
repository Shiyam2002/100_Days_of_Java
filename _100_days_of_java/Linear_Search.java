package _100_days_of_java;

import java.util.Scanner;
public class Linear_Search {
	public static void linear(int[] arr,int len) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int i;
		System.out.println("Enter which element to search for ");
		int key = sc.nextInt();
		for(i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				flag =true;
				break;
			}
		}
		if(flag) {
			System.out.println("Element found at index "+i);
		}
		else {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		int[] arr = {8,6,3,2,4};
		int len = arr.length;
		linear(arr,len);
	}
}