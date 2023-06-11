package _100_days_of_java;

import java.util.Arrays;
public class Remove_Duplicate_Array {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 50, 10, 20 };
        Arrays.sort(a);// sorting array
       removeDuplicate(a);

	}

	private static void removeDuplicate(int[] a) {
		int[] temp = new int[a.length];

        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[a.length - 1];

        for (int i = 0; i < j; i++) {
             a[i] = temp[i];
        }

        for (int i = 0; i < j; i++) {
             System.out.println(temp[i]);
        }
		
	}
}