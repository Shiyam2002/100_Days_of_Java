package _100_days_of_java;

import java.util.Arrays;
public class Array_Concatenate {
	public static void main(String[] args) {
		int[] array1 = {43,65,11};
        int[] array2 = {89, 98,2, 77};

        int fLen = array1.length;
        int sLen = array2.length;
        int[] result = new int[fLen + sLen];

        System.arraycopy(array1, 0, result, 0, fLen);
        System.arraycopy(array2, 0, result, fLen, sLen);

        System.out.println(Arrays.toString(result));
	}
}