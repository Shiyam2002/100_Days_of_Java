package _100_days_of_java;

import java.io.IOException;
import java.util.Scanner;
public class Non_repeated_Character {
	static int firstNonRepeatingCharacter(String str){
        int[] arrayCount = new int[256];
        int[] arrayIndex = new int[256];
        int i;
        for(i=0; i<str.length(); i++){
            arrayCount[str.charAt(i)]++;
            arrayIndex[str.charAt(i)] = i;
        }
        int index = Integer.MAX_VALUE;
        for(i=0; i<256; i++){
            if(arrayCount[i] == 1 && arrayIndex[i] < index)
                index = arrayIndex[i];
        }
        return index;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str = sc.nextLine();
        int index = firstNonRepeatingCharacter(str);
        if(index < str.length())
            System.out.println("First Non Repeating Character is "
                                              + str.charAt(index));
        else
            System.out.println("Each character is repeated");
    }
}