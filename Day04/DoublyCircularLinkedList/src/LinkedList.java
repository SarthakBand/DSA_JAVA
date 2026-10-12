
public class LinkedList {
	static class Node{
		private int data;
		private Node next, prev;
		
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void addFirst(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head
			head = newnode;
			//b. make list circular
			newnode.next = newnode.prev = newnode;
		}
		//3. if list is not empty
		else {
			//a. newnode next = first node
			newnode.next = head;
			//b. newnode prev = last node
			newnode.prev = head.prev;
			//c. last node next = newnode
			head.prev.next = newnode;
			//d. first node prev = newnode
			head.prev = newnode;
			//e. head = newnode
			head = newnode;
		}
	}
	
	public void addLast(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head
			head = newnode;
			//b. make list circular
			newnode.next = newnode.prev = newnode;
		}
		//3. if list is not empty
		else {
			//a. newnode next = first node
			newnode.next = head;
			//b. newnode prev = last node
			newnode.prev = head.prev;
			//c. last node next = newnode
			head.prev.next = newnode;
			//d. first node prev = newnode
			head.prev = newnode;
		}
	}
	
	public void deleteFirst() {
		//1. if empty, return
		if(head == null)
			return;
		//2. if has single node
		else if(head == head.prev)
			head = null;
		//3. if list has multiple node
		else {
			//a. add second node into next of last node
			head.prev.next = head.next;
			//b. add last node into prev of second node
			head.next.prev = head.prev;
			//c. move head on second node
			head = head.next;
		}
	}
	
	public void deleteLast() {
		//1. if empty, return
		if(head == null)
			return;
		//2. if has single node
		else if(head == head.prev)
			head = null;
		//3. if list has multiple node
		else {
			//a. add first node into next of second last node
			head.prev.prev.next = head;
			//b. add second last node into prev of first node
			head.prev = head.prev.prev;
		}
	}
	
	public void fDisplay() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list is not empty
		System.out.print("Forward List : ");
		Node trav = head;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != head);
		System.out.println("");
	}
	
	public void bDisplay() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list is not empty
		System.out.print("Backword List : ");
		Node trav = head.prev;
		do {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}while(trav != head.prev);
		System.out.println("");
	}
}














