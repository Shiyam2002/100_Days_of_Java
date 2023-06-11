package _100_days_of_java;

import java.util.Scanner;
public class NonRepeatingElements {
	static void printElementsWithNoDuplicates(int[] array){
        int i,j;
        int count;
        int x = 0;
        boolean[] flag = new boolean[array.length];
        for(i=0; i<array.length; i++){
            if(!flag[i]){
                count  = 1;
                for(j=i+1; j<array.length;j++){
                    if(array[j] == array[i])
                    {
                        count++;
                        flag[j] = true;
                    }
                }
                if(count == 1){
                    System.out.println(array[i]);
                    x++;
                }
            }
        }
        if(x==0){
            System.out.println("All elements are repeated");
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
                System.out.println("An error Occurred");
            }
        }
        System.out.println("The elements are ");
        printElementsWithNoDuplicates(array);
    }
}