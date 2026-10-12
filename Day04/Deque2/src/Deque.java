
public class Deque {
	static class Node{
		private int data;
		private Node next, prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node front, rear;
	public Deque() {
		front = rear = null;
	}
	
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	public void pushFront(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if queue is empty
		if(isEmpty())
			front = rear = newnode;
		//3. if queue is not empty
		else {
			newnode.next = front;
			front.prev = newnode;
			front = newnode;
		}
	}
	
	public void pushRear(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if queue is empty
		if(isEmpty())
			front = rear = newnode;
		//3. if queue is not empty
		else {
			newnode.prev = rear;
			rear.next = newnode;
			rear = newnode;
		}
	}

	public int popFront() {
		int temp;
		//1. if queue is empty
		if(isEmpty())
			temp = -1;
		//2. if queue has single value
		else if(front == rear) {
			temp = front.data;
			front = rear = null;
		}
		//3. if queue has multiple nodes
		else {
			temp = front.data;
			front = front.next;
			front.prev = null;
		}
		return temp;
	}
	
	public int popRear() {
		int temp;
		//1. if queue is empty
		if(isEmpty())
			temp = -1;
		//2. if queue has single value
		else if(front == rear) {
			temp = rear.data;
			front = rear = null;
		}
		//3. if queue has multiple nodes
		else {
			temp = rear.data;
			rear = rear.prev;
			rear.next = null;
		}
		return temp;
	}
	
	public int peekFront() {
		if(isEmpty())
			return -1;
		return front.data;
	}
	
	public int peekRear() {
		if(isEmpty())
			return -1;
		return rear.data;
	}
}


















