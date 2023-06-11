package _100_days_of_java;

import java.util.Arrays;
public class Bubble_Sort {
	public static void main(String[] args) {
		int[] bubble = {76,34,12,94,23};
		int len = bubble.length;
		int temp;
		System.out.println(Arrays.toString(bubble));
		for(int i=0;i<len;i++) {
			for(int j=1;j<(len-i);j++) {
				if(bubble[j-1]>bubble[j]) {
					temp = bubble[j];
					bubble[j] = bubble[j-1];
					bubble[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(bubble));
	}
}