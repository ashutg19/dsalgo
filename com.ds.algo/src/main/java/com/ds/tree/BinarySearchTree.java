package com.ds.tree;

public class BinarySearchTree {

	class Node {
		Node leftNode;

		Node rightNode;

		int value;
	}

	Node rootNode;
	
	Node parentNode;

	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		rootNode = null;
	}

	public void insertBSTNode(Node node, int value) {
		if (value > node.value) {

			if (node.rightNode == null) {
				Node node2 = new Node();
				node2.value = value;
				node.rightNode = node2;
			} else {

				insertBSTNode(node.rightNode, value);
			}
		} else {
			if (node.leftNode == null) {
				Node node2 = new Node();
				node2.value = value;
				node.leftNode = node2;
			} else {

				insertBSTNode(node.leftNode, value);
			}
		}

	}

	public void insertNode(int value) {
		if (rootNode == null) {
			Node node = new Node();
			node.value = value;
			rootNode = node;
		}

		else {
			insertBSTNode(rootNode, value);

		}

	}

	public Node search(int value) {

		Node node = searchBST(rootNode, value);
		return node;
	}

	private Node searchBST(Node rootNode2, int value) {

		if (rootNode2 == null) {
			return null;
		}
		if (rootNode2.value == value) {
			return rootNode2;
		}

		if (value > rootNode2.value) {
			return searchBST(rootNode2.rightNode, value);
		} else {
			return searchBST(rootNode2.leftNode, value);
		}
	}

	private void deleteNode(int value) {

		Node node = deleteBST(rootNode, value);
		
		
		
		parentNode=new Node();
		parentNode.value=rootNode.value;
		parentNode.leftNode=rootNode.leftNode;
		parentNode.rightNode=rootNode.rightNode;

	}

	private Node deleteBST(Node rootNode2, int value) {

		
		if (rootNode2 == null) {
			return null;
		}

		if (value > rootNode2.value) {
			parentNode = rootNode2;
			deleteBST(rootNode2.rightNode, value);
		} else if (value < rootNode2.value) {
			parentNode = rootNode2;
			deleteBST(rootNode2.leftNode, value);
		}

		else {

			if (rootNode2.leftNode == null && rootNode2.rightNode == null) {
				if (parentNode.value < value) {
					parentNode.rightNode = null;
				} else {
					parentNode.leftNode = null;
				}
				return rootNode2;
			}
			if (rootNode2.rightNode == null) {

				Node node2 = rootNode2.leftNode;
				// node = null;
				if (parentNode.value < value) {
					parentNode.rightNode = node2;
				} else {
					parentNode.leftNode = node2;
				}
				return rootNode2;
			}

			if (rootNode2.leftNode == null) {

				Node node2 = rootNode2.rightNode;
				// node = null;
				if (parentNode.value < value) {
					parentNode.rightNode = node2;
				} else {
					parentNode.leftNode = node2;
				}
				return rootNode2;
			}
			Node node = getMinElemBST(rootNode2.rightNode);
			Node newNode=new Node();
			newNode.value=node.value;
			if (parentNode.value < value) {
				parentNode.rightNode = newNode;
				
			} else {
				parentNode.leftNode = newNode;
			}

			newNode.leftNode = rootNode2.leftNode;
			newNode.rightNode = rootNode2.rightNode;

			deleteBST(rootNode2.rightNode, newNode.value);
		}

		return rootNode2;
	}


	public int MinElemBinarySearch() {
		Node node = getMinElemBST(rootNode);
		return node.value;
	}

	private Node getMinElemBST(Node node) {
		if (node == null) {
			return null;
		}
		if (node.leftNode == null) {
			return node;
		}

		return getMinElemBST(node.leftNode);
	}

	public int maxElemBinarySearch() {
		Node node = getMaxElemBST(rootNode);
		return node.value;
	}

	private Node getMaxElemBST(Node node) {
		if (node == null) {
			return null;
		}
		if (node.rightNode == null) {
			return node;
		}

		return getMaxElemBST(node.rightNode);
	}

	public static void main(String[] args) {

		BinarySearchTree binaryST = new BinarySearchTree();
		binaryST.insertNode(25);
		binaryST.insertNode(16);
		binaryST.insertNode(30);
		binaryST.insertNode(15);
		binaryST.insertNode(28);
		binaryST.insertNode(35);
		
		binaryST.insertNode(32);
		binaryST.insertNode(38);
		binaryST.insertNode(20);
		
		binaryST.insertNode(27);

		Node node25 = binaryST.search(25);
		Node node20 = binaryST.search(20);
		Node node8 = binaryST.search(8);

//		binaryST.insertNode(7);
		binaryST.preOrderTraversal(binaryST.rootNode);
		
		binaryST.deleteNode(30);
		System.out.println("=========================================");
		binaryST.preOrderTraversal(binaryST.rootNode);
	}
	
	public void preOrderTraversal(Node node){
		
		System.out.println(node.value);
		
		
		if (node.leftNode!=null) {
			preOrderTraversal(node.leftNode);
		}
		
		if (node.rightNode!=null) {
			preOrderTraversal(node.rightNode);
		}
		
		
	}
	

}
