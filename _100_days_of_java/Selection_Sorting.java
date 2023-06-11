package _100_days_of_java;

import java.util.Arrays;

public class Selection_Sorting {
	public static void main(String[] args) {
		int[] arr = {34,76,12,65};
		int size = arr.length;
		for(int i=0;i<size-1;i++) {
			int min = i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			 int temp = arr[i];
		      arr[i] = arr[min];
		      arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}