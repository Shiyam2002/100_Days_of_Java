package _100_days_of_java;

import java.util.Scanner;
public class Binary_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {34,56,89,92};
		int len = arr.length;
		System.out.println("Enter the number to search ");
		int key = sc.nextInt();
		binary_search(arr,len,key);
	}

	 static void binary_search(int[] arr, int len,int key) {
		
		int first =0;
		int last = len-1;
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]==key) {
				System.out.println("Element is found at index: " + mid);
				break;
			}
			else if(arr[mid]<key){
				        first = mid + 1;
			}
			else {
		         last = mid - 1;
			}
			  mid = (first + last)/2;  
			
	}
		 if(first>last){  
		      System.out.println("Element is not found!");  
		 	}
	 }
}