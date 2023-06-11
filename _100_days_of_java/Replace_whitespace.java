package _100_days_of_java;

public class Replace_whitespace {
	public static void main(String[] args) {
		 String sentence = "Hi! I am d oin g 1 0 0 da ys o f codin g.";
	        System.out.println("Original sentence: " + sentence);

	        sentence = sentence.replaceAll("\\s", "");
	        System.out.println("After replacement: " + sentence);
	}
}