package _100_days_of_java;

public class String_Word_Count {
	public static void main(String[] args) {
		final  String line = new String("Vanakam da Mapala!");
		int count = 1;
		for(int i=0;i<line.length();i++) {
			if((line.charAt(i) == ' ') && (line.charAt(i+1)!= ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a string => "+count);
	}
}