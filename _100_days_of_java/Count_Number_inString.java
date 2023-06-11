package _100_days_of_java;


public class Count_Number_inString {
	public static void main(String[] args) {
		 String str = "kanna7456Laddu3Thinna00Asaiya";
		 int sum =0;
		 for(char c : str.toCharArray() ) {
			 if(c >= '1' && c <= '9') {
				 sum += (int) Character.getNumericValue(c);
			 }
		 }
		 System.out.println(sum);
  }
}