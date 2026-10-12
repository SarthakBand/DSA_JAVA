
public class Tester {

	public static void main(String[] args) {
		
		Deque dq = new Deque();
		
		dq.pushFront(10);
		dq.pushFront(20);
		dq.pushFront(30);
		// 30-20-10
		dq.pushRear(40);
		dq.pushRear(50);
		// 30-20-10-40-50
		
		System.out.println("Peek front : " + dq.peekFront());
		System.out.println("Peek rear : " + dq.peekRear());
		
		System.out.println("Pop front : " + dq.popFront());
		System.out.println("Pop rear : " + dq.popRear());
		
		System.out.println("Peek front : " + dq.peekFront());
		System.out.println("Peek rear : " + dq.peekRear());
	}

}







