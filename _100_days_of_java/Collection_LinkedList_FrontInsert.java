package _100_days_of_java;

import java.util.LinkedList;
public class Collection_LinkedList_FrontInsert {
	public static void main(String[] args) {
		 LinkedList<String> l_list = new LinkedList<String>();
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		     System.out.println("Original linked list:" + l_list);    
		     l_list.offerFirst("Pink");
		     System.out.println("Final linked list:" + l_list);  
	}
}