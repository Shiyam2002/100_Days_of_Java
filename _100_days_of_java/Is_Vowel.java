package _100_days_of_java;

public class Is_Vowel {
     public static void main(String[] args) {
    	 char ch = 's';
    	 switch (ch) {
		case 'a':
		case 'i':
		case 'o':
		case 'u':
		case 'e':
		case 'A':
		case 'E':
		case 'I':
		case 'U':
		case 'O':
					System.out.println(ch+" is Vowel");
					break;
		default:
			System.out.println(ch+ " is Consonant");
		}
  }
}