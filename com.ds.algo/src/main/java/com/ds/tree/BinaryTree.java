package com.ds.tree;

public class BinaryTree {

	Node rootNode;

	public BinaryTree() {
		rootNode = null;
	}

}

class Node {
	Node leftNode;

	Node rightNode;

	int value;

	public Node(int value) {
		this.value = value;
	}
}
