package com.ds.graph;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {

	private Map<Long, Node> nodeMap = new HashMap<>();

	/*
	 * Disjoint sets using path compression and union by rank Supports 3
	 * operations 1) makeSet 2) union 3) findSet
	 */

	class Node {
		Node parentNode;
		long data;
		int rank;
	}

	public void makeSet(long data) {
		Node node = new Node();
		node.data = data;
		node.rank = 0;
		node.parentNode = node;
		nodeMap.put(data, node);
	}

	public boolean union(long data1, long data2) { 
		
	Node node1 = nodeMap.get(data1);
    Node node2 = nodeMap.get(data2);

    Node parent1 = findSet(node1);
    Node parent2 = findSet(node2);

    //if they are part of same set do nothing
    if (parent1.data == parent2.data) {
        return false;
    }

    //else whoever's rank is higher becomes parent of other
    if (parent1.rank >= parent2.rank) {
        //increment rank only if both sets have same rank
        parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
        parent2.parentNode = parent1;
    } else {
        parent1.parentNode = parent2;
    }
    return true;}

	public long findSet(long data) {
		
		
		
		Node node=findSet(nodeMap.get(data));
		return node.data;
	}

	public Node findSet(Node data) {
		
		Node parentNode=data.parentNode;
		if (parentNode==data) {
			return parentNode;
		}
		data.parentNode=findSet(parentNode);
		return data.parentNode;
	}
	public static void main(String[] args) {
		DisjointSet ds = new DisjointSet();
		ds.makeSet(1);
		ds.makeSet(2);
		ds.makeSet(3);
		ds.makeSet(4);
		ds.makeSet(5);
		ds.makeSet(6);
		ds.makeSet(7);

		ds.union(1, 2);
		ds.union(2, 3);
		ds.union(4, 5);
		ds.union(6, 7);
		ds.union(5, 6);
		ds.union(3, 7);

		System.out.println(ds.findSet(1));
		System.out.println(ds.findSet(2));
		System.out.println(ds.findSet(3));
		System.out.println(ds.findSet(4));
		System.out.println(ds.findSet(5));
		System.out.println(ds.findSet(6));
		System.out.println(ds.findSet(7));
	}

}
