package _100_days_of_java;

import java.util.Random;
public class Random_String {
	public static void main(String[] args) {
		String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder strb = new StringBuilder();
		Random ran = new Random();
		int length = 10;
		for(int i=0;i<length;i++) {
			int index = ran.nextInt(str.length());
			char word = str.charAt(index);
			strb.append(word);
		}
		String result = strb.toString();
		System.out.println("The Random String is "+result);
	}
}