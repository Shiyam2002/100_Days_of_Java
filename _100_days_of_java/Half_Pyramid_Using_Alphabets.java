package _100_days_of_java;

public class Half_Pyramid_Using_Alphabets {
	public static void main(String[] args) {
		char alpha='A' , last='H';
		for(int i=1;i<=(last-'A'+1);i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(alpha+" ");
			}
			++alpha;
			System.out.println();
		}
	}
}