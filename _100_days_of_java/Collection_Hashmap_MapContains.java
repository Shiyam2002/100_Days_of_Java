package _100_days_of_java;

import java.util.HashMap;
public class Collection_Hashmap_MapContains {
	 public static void main(String args[]) {
		  HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  System.out.println("The Original map: " + hash_map);
		  System.out.println("1. Is value \'Green\' exists?");
		  if (hash_map.containsValue("Green")) {
		   System.out.println("Yes! ");
		  } else {
		   System.out.println("no!");
		  }
		  System.out.println("\n2. Is value \'orange\' exists?");
		  if (hash_map.containsValue("orange")) {
		   System.out.println("yes! - " );
		  } else {
		   System.out.println("No!");
		  }
	 }
}