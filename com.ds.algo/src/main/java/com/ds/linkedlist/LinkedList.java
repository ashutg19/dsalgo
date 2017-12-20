package com.ds.linkedlist;

public class LinkedList {

	Node headNode;

	static class Node {

		int data;
		Node nextNode;

		public Node(int data) {
			this.data = data;
		}

	}

	
	
	public void traverseList(){
		if (headNode==null) {
			System.out.println("No data found");
		}
		else{
			
			Node node=headNode;
			
			while(node!=null){
				System.out.println(node.data);
				node=node.nextNode;
			}
			
			System.out.println("End");
			
			
		}		
		
		
		
	}
	
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		Node node = new Node(2);
		Node node2 = new Node(5);
		
		linkedList.headNode=node;
		node.nextNode=node2;

		
		linkedList.traverseList();
	}
}
