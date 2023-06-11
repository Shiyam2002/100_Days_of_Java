package _100_days_of_java;

import java.util.HashSet;
public class Collection_Hashset_SearchnRetain {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
		 set.add("Apple");
		 set.add("Banana");
		 set.add("Lemon");
		 HashSet<String> set2 = new HashSet<String>();
		 set2.add("Mango");
		 set2.add("Lemon");
		 set2.add("Orange");
		 set.retainAll(set2);
		 System.out.println("HashSet content: ");
		 System.out.println(set);
	}
}