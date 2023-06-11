package _100_days_of_java;

import java.util.Stack;
public class Collection_Stack_Operations {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Royal Enfield Classic 350");
		stack.push("Mini Cooper JCW");
		stack.push("Yahama RX 100");
		stack.push("Honda City");
		stack.push("Jeep Wrangler");
		
		System.out.println(stack);
		System.out.println("The Top Element is "+stack.peek());
		System.out.println();
		stack.add("BMW Series 3");
		System.out.println(stack);
		System.out.println("Now the Top Element is "+stack.peek());
		System.out.println();
		stack.pop();
		System.out.println(stack);
		System.out.println("The Top Element is "+stack.peek());
		System.out.println();
		stack.remove(0);
		System.out.println(stack);
		System.out.println("The Top Element is "+stack.peek());	
	}
}