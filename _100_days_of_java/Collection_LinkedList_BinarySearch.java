package _100_days_of_java;

import java.util.Collections;
import java.util.LinkedList;
public class Collection_LinkedList_BinarySearch {
	public static void main(String[] args) {
		LinkedList<Integer> pinCode = new LinkedList<Integer>();
		
		pinCode.add(600001);
		pinCode.add(605007);
		pinCode.add(624622);
		pinCode.add(635111);
		pinCode.add(642113);
		pinCode.add(643253);
		
		Integer index = Collections.binarySearch(pinCode,642113 );
		if(index != 0) {
			System.out.println("Element Found at Index : "+ index.intValue());
		}
		else {
			System.out.println("Element not Found");
		}	
	}
}