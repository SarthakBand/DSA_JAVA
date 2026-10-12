package demo.stack;

public class Stack {

	private int arr[];
	private final int SIZE;
	private int top;

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println(" STACK IS FULL ");
		} else {
			// 1. Reposition top
			top++;
			// 2. Add value at top index
			arr[top] = value;
		}
	}

	public int pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println(" STACK IS EMPTY ");
		}
		else {
			temp = arr[top];
			// Reposition top
			top--;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println(" STACK IS EMPTY ");
		}
		else {
			// 1. Read value of top index 
			temp = arr[top];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}
}
