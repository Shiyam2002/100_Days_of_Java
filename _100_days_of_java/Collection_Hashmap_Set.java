package _100_days_of_java;

import java.util.HashMap;
import java.util.Set;
public class Collection_Hashmap_Set {
	public static void main(String[] args) {
		  HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
		  hash_map.put(1, "Apple");
		  hash_map.put(2, "Banana");
		  hash_map.put(3, "Guva");
		  hash_map.put(4, "Orange");
		  hash_map.put(5, "Mango");
		  Set set = hash_map.entrySet();
		  System.out.println("Set values: " + set);
	}
}