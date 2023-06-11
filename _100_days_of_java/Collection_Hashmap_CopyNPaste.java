package _100_days_of_java;

import java.util.HashMap;
public class Collection_Hashmap_CopyNPaste {
	public static void main(String[] args) {
		HashMap<Integer, String> hashlist = new HashMap<Integer,String>();
		HashMap<Integer, String> copylist = new HashMap<Integer,String>();
		hashlist.put(1, "Apple");
		hashlist.put(2, "Banana");
		hashlist.put(3, "Guva");
		System.out.println("values in first map :"+hashlist);
		copylist.put(4, "Orange");
		copylist.put(5, "Mango");
		copylist.put(6, "Kiwit");
		System.out.println("copylistalues in second map : "+copylist);
		copylist.putAll(hashlist);
		System.out.println("New values in the second are : "+ copylist);
	}
}