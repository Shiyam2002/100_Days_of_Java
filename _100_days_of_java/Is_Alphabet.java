package _100_days_of_java;

public class Is_Alphabet {
	public static void main(String[] args) {
		 char c = '/';

	        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	            System.out.println(c + " is an alphabet.");
	        else
	            System.out.println(c + " is not an alphabet.");

	}
}