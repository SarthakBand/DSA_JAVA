package com.expressionevaluate;

public class PostfixEvaluation {

	public static int calculate(int op1, char ele, int op2) {
		switch (ele) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		case '$':
			return (int) Math.pow(op1, op2);
		}
		return 0;
	}

	public static int postfixEvaluation(String postfix) {
		// 0. Create a stack to push operands
		int st[] = new int[10];
		int top = -1;

		// 1. traverse postfix expression from left to right
		for (int i = 0; i < postfix.length(); i++) {

			// 2. extract element from string
			char ele = postfix.charAt(i);

			// 3. If element is operand, push on stack
			if (Character.isDigit(ele)) {
				// To convert character digit into number
				st[++top] = ele - '0';
			}
			// 4. If element is operator
			else {
				// 4.1 pop two elements from stack
				int op2 = st[top--];
				int op1 = st[top--];

				// 4.2 Perform operation of op1 and op2
				int res = calculate(op1, ele, op2);

				// 4.3 Push result on stack
				st[++top] = res;
			}
		}

		// 5. Return result from stack
		return st[top];
	}

	public static void main(String[] args) {

		String postfix = "456*3/+9+7-";

		int result = postfixEvaluation(postfix);
		System.out.println(postfix + " = " + result);
	}
}
