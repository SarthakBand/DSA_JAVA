
public class Deque {
	LinkedList list;
	
	public Deque() {
		list = new LinkedList();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void pushFront(int value) {
		list.addFirst(value);
	}

	public void pushRear(int value) {
		list.addLast(value);
	}
	
	public int popFront() {
		return list.deleteFirst();
	}
	
	public int popRear() {
		return list.deleteLast();
	}
	
	public int peekFront() {
		return list.getHeadData();
	}
	
	public int peekRear() {
		return list.getTailData();
	}
}











