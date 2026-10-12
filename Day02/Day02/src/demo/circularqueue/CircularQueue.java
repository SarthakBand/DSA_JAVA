package demo.circularqueue;

public class CircularQueue {

	private int arr[];
	private final int SIZE;
	private int front, rear;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}

	public void offer(int value) {
		if (isFull()) {
			System.out.println(" QUEUE IS FULL ");
		} else {
			// 1. Reposition Rear
			rear = (rear + 1) % SIZE;

			// 2. add value at rear index
			arr[rear] = value;
		}
	}

	public int poll() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println(" QUEUE IS EMPTY");
		} else {
			temp = arr[(front + 1) % SIZE];

			// 1. Reposition front
			front = (front + 1) % SIZE;

			// 2. check for empty and reposition front andd rear back to -1
			if (front == rear) {
				front = rear = -1;
			}
		}
		return -1;
	}

	public int peek() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println(" QUEUE IS EMPTY");
		} else {

			// 1. Read value from front end
			temp = arr[(front + 1) % SIZE];
		}
		return temp;
	}

	public boolean isEmpty() {
		return front == rear && rear == -1;
	}

	public boolean isFull() {
		return (front == -1 && rear == SIZE - 1) || (front == rear && rear != -1);
	}
}
