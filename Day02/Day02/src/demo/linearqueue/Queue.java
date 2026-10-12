package demo.linearqueue;

public class Queue {

	private int arr[];
	private final int SIZE;
	private int front, rear;

	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}

	public void offer(int value) {

		if (isFull()) {
			System.out.println(" QUEUE IS FULL ");
		} else {
			// 1. Reposition rear
			rear++;
			// 2. Add value at rear index
			arr[rear] = value;
		}
	}

	public int poll() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println(" QUEUE IS EMPTY ");
		} else {
			temp = arr[front + 1];
			// 1. Reposition front
			front++;

			// 2. Check for empty and reposition front and rear back to -1
			if (front == rear) {
				front = rear = -1;
			}

		}
		return temp;
	}

	public int peek() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println(" QUEUE IS EMPTY");
		} else {
			// 1. Read value from front end
			temp = arr[front + 1];
		}
		return temp;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear == SIZE - 1;
	}

}
