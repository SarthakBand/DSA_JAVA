
public class LinkedList {
	static class Node{
		private int data;
		private Node next, prev;
		
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head, tail;
	private int size;
	
	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
		//return head == null && tail == null;
		//return size == 0;
	}
	
	public void forwardDisplay() {
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void addFirst(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty, add newnode into head and tail
		if(head == null)
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
		// increment size
		size++;
	}
	
	public void addLast(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty, add newnode into head and tail
		if(head == null)
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add last node into prev of newnode
			newnode.prev = tail;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
		// increment size
		size++;
	}
	
	public void addPosition(int value, int pos) {
		//0. return if position is invalid (< 1 or > size + 1)
		if(pos < 1 || pos > size + 1)
			return;
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty, add newnode into head and tail
		if(head == null)
			head = tail = newnode;
		// case 1 : pos = 1
		else if(pos == 1) {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
		// case 2 : pos = size + 1
		else if(pos == size + 1) {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;
		}
		//3. if list is not empty
		else {
			//a. traverse till pos - 1 node
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add pos -1 node into prev of newnode
			newnode.prev = trav;
			//d. add newnode into prev of pos node
			trav.next.prev = newnode;
			//e. add newnode into next of pos -1 node
			trav.next = newnode;
					
		}
		// increment size
		size++;
	}
	
	public void deleteFirst() {
		//1. if list is empty, return
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. move head on second node
			head = head.next;
			//b. add null into prev of second node
			head.prev = null;
		}
		// decrement size
		size--;
	}
	
	public void deleteLast() {
		//1. if list is empty, return
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. move tail on second last node
			tail = tail.prev;
			//b. add null into next of second last node
			tail.next = null;
		}
		// decrement size
		size--;
	}
	
	public void deletePosition(int pos) {
		//0. return if pos is invalid ( < 1 or > size)
		if(pos < 1 || pos > size)
			return;
		//1. if list is empty, return
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		// case 1 : pos = 1
		else if(pos == 1) {
			head = head.next;
			head.prev = null;
		}
		// case 2 : pos = size
		else if(pos == size) {
			tail = tail.prev;
			tail.next = null;
		}
		//3. if list has multiple nodes
		else {
			//a. traverse till pos node
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			//b. add pos - 1 node into prev of pos + 1 node
			trav.next.prev = trav.prev;
			//c. add pos + 1 node into next of pos - 1 node
			trav.prev.next = trav.next;
		}
		// decrement size
		size--;
	}
	
	public int size() {
		return size;
	}
	
	public void backwardDisplay() {
		Node trav = tail;
		System.out.print("Backward List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}
		System.out.println("");
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
}













