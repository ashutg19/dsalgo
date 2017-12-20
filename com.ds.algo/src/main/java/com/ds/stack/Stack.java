package com.ds.stack;

public class Stack {

	int[] stackBaseArray;

	int head, tail;

	public Stack(int stackSize) {
		stackBaseArray = new int[5];
		head = -1;
		tail = -1;
	}

	public void push(int data) {
		if (head == stackBaseArray.length - 1) {
			System.out.println("Stack Full");
			return;
		}
		head = head + 1;
		tail = tail + 1;
		stackBaseArray[head] = data;
	}

	public void pop() {
		if (head == -1) {
			System.out.println("Stack Empty");
			return;
		}
		head--;
		tail--;
	}

	public void traverse() {

	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(9);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(9);
		stack.push(3);
	}

}
