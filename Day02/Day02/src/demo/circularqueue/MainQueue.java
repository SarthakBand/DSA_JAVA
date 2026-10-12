package demo.circularqueue;

import java.util.Scanner;

public class MainQueue {

	public static void main(String[] args) {

		CircularQueue cq = new CircularQueue(4);

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Offer\n2. Poll\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.print(" Enter value to be pushed :");
				int value = sc.nextInt();
				cq.offer(value);
				break;
			}

			case 2: {
				System.out.println(" Poped value : "+ cq.poll());
				break;
			}

			case 3: {
				System.out.println(" Peeked value : "+ cq.peek());
				break;
			}
			default:
				break;
			}

		} while (choice != 0);
		
		sc.close();
	}
}
