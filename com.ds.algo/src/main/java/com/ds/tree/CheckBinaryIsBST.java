package com.ds.tree;

public class CheckBinaryIsBST {

	public static void main(String[] args) {

		//checkBinaryTree();
		checkBSTTree();
	}

	
	
	
	
	private static void checkBinaryTree() {
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

		CheckBinaryIsBST checkBinaryIsBST = new CheckBinaryIsBST();
		System.out.println("Is BST--" + checkBinaryIsBST.checkBinaryTreeIsBST(rootNode));
	}
	
	
	
	private static void checkBSTTree() {
		
		BinarySearchTree binaryST = new BinarySearchTree();
		binaryST.insertNode(10);
		binaryST.insertNode(8);
		binaryST.insertNode(9);
		binaryST.insertNode(12);
		binaryST.insertNode(5);
		binaryST.insertNode(7);

		CheckBinaryIsBST checkBinaryIsBST = new CheckBinaryIsBST();
		System.out.println("Is BST--" + checkBinaryIsBST.checkBinaryTreeIsBST(binaryST.rootNode));
	}

	public boolean checkBinaryTreeIsBST(Node node) {

		if (node.leftNode == null && node.rightNode == null) {
			return true;
		}

		if (node.rightNode == null && node.leftNode != null && node.value > node.leftNode.value) {
			return true;
		}

		if (node.leftNode == null && node.rightNode != null && node.value < node.rightNode.value) {
			return true;
		}

		if (node.value < node.leftNode.value || node.value > node.rightNode.value) {
			return false;
		}

		return checkBinaryTreeIsBST(node.leftNode) || checkBinaryTreeIsBST(node.rightNode);

	};
	
	
	public boolean checkBinaryTreeIsBST(BinarySearchTree.Node node) {

		if (node.leftNode == null && node.rightNode == null) {
			return true;
		}

		if (node.rightNode == null && node.leftNode != null && node.value > node.leftNode.value) {
			return true;
		}

		if (node.leftNode == null && node.rightNode != null && node.value < node.rightNode.value) {
			return true;
		}

		if (node.value < node.leftNode.value || node.value > node.rightNode.value) {
			return false;
		}

		return checkBinaryTreeIsBST(node.leftNode) || checkBinaryTreeIsBST(node.rightNode);

	};

}
