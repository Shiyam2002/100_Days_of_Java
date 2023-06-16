package _100_days_of_java;

import java.util.ArrayList;
import java.util.Collections;
public class Collection_ArrayList_Operations2 {
	public static void main(String[] args) {
		ArrayList<Character> sequence = new ArrayList<Character>();
		Character chValue ;
		sequence.add('@');
		sequence.add('!');
		sequence.add('#');
		sequence.add('$');
		sequence.add('%');
		
		System.out.println(sequence);
		chValue='@';
		if(sequence.contains(chValue)) {
			sequence.remove(0);
			sequence.add(0, '*');
			System.out.println(sequence);
		}
		else {
			System.out.println("Doesn't Exists");
		}
	}
}