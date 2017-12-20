package com.ds.stack;

import java.util.Stack;

public class EvaluatePostFixExpression {

	public Stack<Integer> integers = new Stack<>();

	public int evaluatePostFixExpression(String expression) {

		for (int i = 0; i <= expression.length() - 1; i++) {

			char c = expression.charAt(i);

			if (Character.isDigit(c)) {
				integers.push(c - '0');
				// Push into Stack

			} else {
				int val1 = integers.pop();
				int val2 = integers.pop();

				switch (c) {

				case '+':
					integers.push(val2 + val1);
					break;

				case '-':
					integers.push(val2 - val1);
					break;

				case '/':
					integers.push(val2 / val1);
					break;

				case '*':
					integers.push(val2 * val1);
					break;

				}

				// Pop from Stack and make calculation

			}

		}

		return integers.pop();
	}

	public static void main(String[] args) {

		EvaluatePostFixExpression evaluatePostFixExpression = new EvaluatePostFixExpression();
		String exp = "231*+9-";
		System.out.println(evaluatePostFixExpression.evaluatePostFixExpression(exp));
	}

}
