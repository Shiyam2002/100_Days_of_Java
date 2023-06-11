package _100_days_of_java;

import java.util.HashMap;
import java.util.Map;
public class Collection_Hashmap_Create {
	public static void main(String[] args) {
	HashMap<Integer, String> rollno = new HashMap<Integer,String>();
	rollno.put(1, "Kosaksi Pasapugazh");
	rollno.put(2, "Venkat Ramakrishnan");
	rollno.put(3, "Sevarkodi Senthil");
	for(Map.Entry i: rollno.entrySet()) {
		System.out.println(i.getKey()+" "+i.getValue());
	}
	}
}