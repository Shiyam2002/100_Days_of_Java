package _100_days_of_java;

import java.util.Scanner;
public class Transpose_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows and columns");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("Enter the Matrix elements");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		display(matrix);
		int[][] transpose = new int[col][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		display(transpose);
	}

	private static void display(int[][] matrix) {
		System.out.println("The matrix is");
		for(int[] row:matrix) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}