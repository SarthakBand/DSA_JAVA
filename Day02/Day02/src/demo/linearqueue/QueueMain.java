package demo.linearqueue;
import java.util.Scanner;
public class QueueMain {

	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Offer\n2. Poll\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter value to be pushed : ");
				int value = sc.nextInt();
				q.offer(value);
				break;
			case 2:
				System.out.println("Poped value : " + q.poll());
				break;
			case 3:
				System.out.println("Peeked value : " + q.peek());
				break;
			}
			
		}while(choice != 0);
		
		sc.close();

	}
}
