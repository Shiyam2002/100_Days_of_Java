package _100_days_of_java;

import java.util.HashSet;
public class Collection_Hashset_To_ArrayList {
	public static void main(String[] args) {
    HashSet<String> h_set = new HashSet<String>();
         h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
     System.out.println("Original Hash Set: " + h_set);
     String[] new_array = new String[h_set.size()];
     h_set.toArray(new_array);
    System.out.println("Array elements: ");
     for(String element : new_array){
       System.out.println(element);
    }
  }
}