package _100_days_of_java;

public class Unique_Character {
	public static void main(String[] args) {
		  System.out.println("code has all unique chars : "+ hasAllUniqueChars("code"));
		  System.out.println("I am Waiting ! has all unique chars : "+ hasAllUniqueChars("I am Waiting !"));
		  System.out.println("It's just a Begining has all unique chars : "+ hasAllUniqueChars("It's just a Begining"));
		  System.out.println("Varata mama trr.. has all unique chars : "+ hasAllUniqueChars("Varata mama trr.."));
		 }
		 
		 public static boolean hasAllUniqueChars (String word) {
		     for(int index=0;index < word.length(); index ++)   {
		         char c =word.charAt(index);
		         if(word.indexOf(c)!=word.lastIndexOf(c))
		              return false;
		     }
		     return true;
		 }
}