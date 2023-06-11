package _100_days_of_java;

import java.util.HashSet;
public class Collection_Hashset_RemoveAll {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
		 set.add("Apple");
		 set.add("Banana");
		 set.add("Lemon");
		 System.out.println("Before Cleaning : "+set);
		 set.removeAll(set);
		 System.out.println("After Cleaning : "+set);
	}
}