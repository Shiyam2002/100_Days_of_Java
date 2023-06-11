package _100_days_of_java;

public class Checking_Word_Easy_to_Pronounce {
	public static void main(String[] args) {
		String word = "Otorhinolaryngologist";
		int length = word.length();
		word = word.toLowerCase();
		//It is said that word is hard to pronounce 
		//if it contains 4 or more consonants in a row
		if(length <4) {
			System.out.println("Easy to Pronounce");
		}
		else {
			int count = 0;
			for(int i =0;i<word.length();i++) {
				if(count==4) {
					break;
				}
				if(word.charAt(i)=='a'||word.charAt(i)=='e'||
					word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
					count=0;
				}
				else {
					count++;
				}
			}
			if(count == 4) {
				System.out.println("Difficult to Pronounce");
			}
			else {
				System.out.println("Easy to Pronounce");
			}
		}	
	}
}