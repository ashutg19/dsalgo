package com.ds.queue;

public class Queue {

	int[] queueBaseArray;

	int front, rear;

	public Queue(int queueSize) {
		queueBaseArray = new int[queueSize];
		front = -1;
		rear = -1;
	}

	public void push(int data) {
		if (rear == queueBaseArray.length - 1) {
			System.out.println("Queue Full");
			return;
		}
		if (front == -1) {
			front++;
		}
		queueBaseArray[++rear] = data;
	}

	public int pop() {
		
		return queueBaseArray[front++];
		
		//Also need to shift all element from right to left and decrease rear by 1
	}

	public void traverse() {

	}

	public static void main(String[] args) {

		Queue queue = new Queue(4);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.push(6);
		queue.push(7);

	}

}
