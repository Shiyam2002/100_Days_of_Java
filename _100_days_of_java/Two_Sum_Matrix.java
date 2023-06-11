package _100_days_of_java;

import java.util.Scanner;
public class Two_Sum_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of two dimensional array");
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		int[][] arr1 = new int[i][j];
		int[][] arr2 = new int[i][j];
		int[][] result = new int[i][j];
		
		System.out.println("Enter first Array elements");
		for(int k=0;k<arr1.length;k++) {
			for(int l=0;l<arr1.length;l++) {
				arr1[k][l] = sc.nextInt();
			}
		}
		
		System.out.println("Enter second Array elements");
		for(int k=0;k<arr2.length;k++) {
			for(int l=0;l<arr2.length;l++) {
				arr2[k][l] = sc.nextInt();
			}
		}
		
		System.out.println("Adding two matrix...");
		for(int k=0;k<arr1.length;k++) {
			for(int l=0;l<arr1.length;l++) {
				result[k][l] = arr1[k][l] + arr2[k][l];
			}
		}
		
		System.out.println("Sum of two matrix is");
		for(int k=0;k<result.length;k++) {
			for(int l=0;l<result.length;l++) {
				System.out.print(result[k][l]+" ");
			}
			System.out.println();
		}
	}
}