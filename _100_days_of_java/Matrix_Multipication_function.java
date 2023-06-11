package _100_days_of_java;

import java.util.Scanner;
public class Matrix_Multipication_function {
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
		
		 result= multipication(arr1,arr2,i,j);
		
		displayarray(result);
		sc.close();
	}

	private static void displayarray(int[][] result) {
		System.out.println("The Product of Two Matrices is : ");
		for(int[] row : result) {
			for(int col : row ) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private static int[][] multipication(int[][] arr1, int[][] arr2, int i, int j) {
		int[][] product = new int[i][j];
		for(int k=0;k<product.length;k++) {
			for(int l=0;l<product.length;l++) {
				for(int m=0;m<product.length;m++) {
					product[k][l] += arr1[k][m] * arr2[m][l]; 
				}
			}
		}
		return product;
	}
}