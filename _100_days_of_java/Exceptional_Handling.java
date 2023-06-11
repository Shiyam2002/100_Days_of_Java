package _100_days_of_java;

public class Exceptional_Handling {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			arr[0] = 1;
			arr[5] = 0;
			int result = arr[0] / arr[5];
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("Wrong operation");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong Index Value");
		}
		catch (Exception e) {
			System.out.println("Error in Program");
		}
	}
}