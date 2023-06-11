package _100_days_of_java;

import java.util.Scanner;
public class Remove_Duplicates {
    static int removeDuplicates(int[] array){
        int replaceIndex = 0;
        int i,j;
        for(i=0; i<array.length; i++){
            for(j=i+1; j<array.length; j++){
                if(array[j]!=array[i]){
                    break;
                }
            }
            array[replaceIndex++] = array[i];
            i = j-1;
        }
        return replaceIndex;
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
        System.out.println("Enter array elements in sorted order");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("An error occurred");
                return;
            }
        }
        int index = removeDuplicates(array);
        System.out.println("Array after removing duplicates is");
        for(i=0; i<index; i++){
            System.out.print(array[i] + " ");
        }
    }
}