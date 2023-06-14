package _100_days_of_java;

import java.util.LinkedList;
import java.util.Queue;
public class Collection_Queue_Operation2 {
	public static void main(String[] args) {
		Queue<String> House = new LinkedList<String>();
		House.add("Sand");
		House.add("Cement");
		House.add("Water");
		House.add("Brick");
		House.add("Cement");
		House.add("Paint");
		House.add("Decorators and Furnitures");
		
		System.out.println(House);
		if(House.contains("Cement")) {
			System.out.println("Given Element Cement Does Exist");
		}
		else {
			System.out.println("Given Element Cement Does not Exist");
		}
	}
}