package _100_days_of_java;

public class IsDigit_String {
	public static void main(String[] args) {
		String str = "12345654328";
		boolean result = str.matches("[0-9]+");
		System.out.println("Does string contain only Digits? : " + result);
	}
}