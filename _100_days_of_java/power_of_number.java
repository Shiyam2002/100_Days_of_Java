package _100_days_of_java;

public class power_of_number {
	public static void main(String[] args) {
		 int base = 5, exponent = 4;
		    long result = 1;
		    while (exponent != 0) {
		      result *= base;
		      --exponent;
		    }
		    System.out.println("Answer = " + result);
  }
}