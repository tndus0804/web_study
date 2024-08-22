package collectiontest;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println(stack.empty());
		stack.push("호랑이");
		stack.push("사자");
		stack.push("코끼리");
		System.out.println(stack.empty());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		if(!stack.isEmpty())
			System.out.println(stack.pop());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //main
} // class
