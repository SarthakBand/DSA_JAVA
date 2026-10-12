package demo.stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		
		Stack st = new Stack(4);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter value to be pushed : ");
				int value = sc.nextInt();
				st.push(value);
				break;
			case 2:
				System.out.println("Poped value : " + st.pop());
				break;
			case 3:
				System.out.println("Peeked value : " + st.peek());
				break;
			}
			
		}while(choice != 0);
		
		sc.close();

	}

}










