package com.ds.tree;

public class BinaryTreeTraversal {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void preOrderTraversal(Node node){
		
		System.out.println(node.value);
		
		
		if (node.leftNode!=null) {
			preOrderTraversal(node.leftNode);
		}
		
		if (node.rightNode!=null) {
			preOrderTraversal(node.rightNode);
		}
		
		
	}
	
	
	
public void postOrderTraversal(Node node){
		
	if (node.leftNode!=null) {
		postOrderTraversal(node.leftNode);
	}
	
	if (node.rightNode!=null) {
		postOrderTraversal(node.rightNode);
	}

	
	System.out.println(node.value);
		
		
		
		
	}



public void levelOrderTraversal(Node node){
	
	
	System.out.println(node.value);
	
	if (node.leftNode!=null) {
		
		System.out.println(node.leftNode.value);
		postOrderTraversal(node.leftNode);
	}
	
	if (node.rightNode!=null) {
		System.out.println(node.rightNode.value);
		postOrderTraversal(node.rightNode);
	}

	
	System.out.println(node.value);
		
		
		
		
	}



public void inOrderTraversal(Node node){
	
	if (node.leftNode!=null) {
		inOrderTraversal(node.leftNode);
	}
	
	System.out.println(node.value);
	
	if (node.rightNode!=null) {
		inOrderTraversal(node.rightNode);
	}

	
	
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		BinaryTreeTraversal binaryTreeTraversal=new BinaryTreeTraversal();
		BinaryTree binaryTree = new BinaryTree();
		Node rootNode = new Node(45);
		binaryTree.rootNode = rootNode;
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		
		// Inserting datat in treee

				rootNode.leftNode = node1;
				rootNode.rightNode = node2;

				node1.leftNode = node3;
				node1.rightNode = node4;

				node2.leftNode = node5;
				node2.rightNode = node6;

				node4.leftNode = node7;
				node4.rightNode = node8;

				node5.leftNode = node9;

				node6.rightNode = node10;

				node8.leftNode = node11;
//		binaryTreeTraversal.preOrderTraversal(rootNode);
		
		binaryTreeTraversal.postOrderTraversal(rootNode);
	}

}
