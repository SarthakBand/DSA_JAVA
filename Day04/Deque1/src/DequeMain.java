
public class DequeMain {

	public static void main(String[] args) {
		
		Deque q = new Deque();
		
		q.pushFront(10);
		q.pushFront(20);
		q.pushRear(30);
		q.pushRear(40);
		
		
		while(!q.isEmpty())
			System.out.println("popped value : " + q.popFront());

	}

}
