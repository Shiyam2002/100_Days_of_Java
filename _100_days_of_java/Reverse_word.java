package _100_days_of_java;

import java.util.Scanner;
public class Reverse_word {
	 static String reverseString(String str) {
	        String[] words = str.split(" ");
	        String rev = "";
	        int i, j;
	        for (i = 0; i < words.length; i++) {
	            StringBuffer sb = new StringBuffer(words[i]);
	            rev+=sb.reverse().toString();
	            rev+=" ";
	        }
	        return rev;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "Undaana kaayamengum thannalae aaripona\r\n"
				+ "Maayam enna ponmanae ponmanae";
		String rev = reverseString(word);
        System.out.println("The reverse of the string word by word in place is\n");
        System.out.println(rev);
	}
}