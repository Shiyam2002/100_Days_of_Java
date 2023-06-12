package _100_days_of_java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Collection_Queue_Operations {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("Queue");
		queue.add("is");
		queue.add("First-In");
		queue.add("First-Out");
		queue.add("Method");
		System.out.println(queue);
		System.out.println("The Element removed is = "+queue.remove());
		System.out.println(queue);
		System.out.println("The top element is = "+queue.peek());
		System.out.println("The Searching element is \"Method\"");
		if(queue.contains("Method")) {
			System.out.println("Contains the Required element");
		}
		else {
			System.out.println("Doesn't Contain the Required element");
		}
	}
}