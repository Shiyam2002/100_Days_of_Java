package _100_days_of_java;

import java.util.Stack;
public class Collection_Stack_Operation2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Stack");
		stack.push("Vector");
		stack.push("List");
		stack.push("Collection");
		stack.push("Iterable");
		
		System.out.println(stack);
		int pos;
		if(stack.empty()) {
			System.out.println("stack is empty");
		}
		else {
			pos=stack.search("List");
			System.out.println("Position of List "+pos);
		}	
	}
}