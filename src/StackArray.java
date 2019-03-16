import java.util.ArrayList;

public class StackArray {
	
	private ArrayList<String> stack;
	private int size;
	
	public StackArray() {
		stack = new ArrayList<String>();
		size = 0;
	}
	
	//stack[0] first element
	//Adds element to the top of the stack
	public void push(String input) {
		stack.add(input);
		size += 1;
	}
	
	//Removes element from the top of the stack, adjusts the size
	public String pop() {
		size -= 1;
		return stack.remove(size);
	}
	
	//Returns top element, nothing shifted
	public String peek() {
		return stack.get(size - 1);
	}
	
	//Prints each element in the stack
	public void showStack() {
		if (size == 0) {
			System.out.println("Empty stack");
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.println(stack.get(i));
		}
	}
}
