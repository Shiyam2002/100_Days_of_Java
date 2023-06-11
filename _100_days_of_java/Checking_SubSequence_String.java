package _100_days_of_java;

import java.util.Arrays;
import java.util.Scanner;
public class Checking_SubSequence_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
		    int n= sc.nextInt();
		    char ch[] = sc.next().toCharArray();
		    Arrays.sort(ch);
		    if(n%2!=0){
		        System.out.println("NO");
		        continue;
		    }
		    char f='0';
		    for(int j=0;j<n;j+=2){
		        if(ch[j]!=ch[j+1]){
		            f='1';
		            break;
		        }
		    }
		    if(f=='0')
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}