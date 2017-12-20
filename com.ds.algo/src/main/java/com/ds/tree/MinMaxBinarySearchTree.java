package com.ds.tree;

public class MinMaxBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree binaryST = new BinarySearchTree();
		binaryST.insertNode(10);
		binaryST.insertNode(8);
		binaryST.insertNode(9);
		binaryST.insertNode(12);
		binaryST.insertNode(5);
		binaryST.insertNode(7);
		
	System.out.println("Min elem-"+	binaryST.MinElemBinarySearch());
	
	
	
	System.out.println("Min elem-"+	binaryST.maxElemBinarySearch());
		
		
		
		
		
		
		
		

	}

}
