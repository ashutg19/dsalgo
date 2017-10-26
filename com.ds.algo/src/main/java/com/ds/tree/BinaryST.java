package com.ds.tree;

public class BinaryST {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinaryST() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) {
		if (root==null) {
			root=new Node(key);
		}
		
		

		return root;
	}

	public static void main(String[] args) {
		BinaryST binaryST = new BinaryST();
		binaryST.insert(5);
	}

}
