package _100_days_of_java;

import java.util.HashMap;
public class Collection_Hashmap_KeyValue {
	public static void main(String[] args) {
		HashMap<Integer,String> key= new HashMap<Integer,String>();  
		  key.put(1, "Red");
		  key.put(2, "Green");
		  key.put(3, "Black");
		  key.put(4, "White");
		  key.put(5, "Blue");
		  System.out.println("Size of the hash map: "+key.size());
	}
}