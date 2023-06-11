package _100_days_of_java;

import java.util.Scanner;
public class Rotate_Array {
	static void rotateArray(int[] array, int n){
        int i,j,temp,temp1;
        for(i=1;i<=n;i++){
            temp = array[0];
            for(j=0;j<array.length;j++){
                temp1 = array[(j+1) % array.length];
                array[(j+1) % array.length] = temp;
                temp = temp1;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("An error occurred");
                return;
            }
        }
        System.out.println("The contents of the array before rotation are");
        for(i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int n;
        System.out.println("Enter the number by which the array elements are to " 
                            + "be rotated");
        try{
            n=sc.nextInt();
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        rotateArray(array,n);
        System.out.println("The contents of the array after rotation are");
        for(i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}