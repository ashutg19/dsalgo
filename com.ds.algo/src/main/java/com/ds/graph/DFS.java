package com.ds.graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	
	
	int numberOfVertices;
	
	LinkedList<Integer>[] integers=null;
	
	
	public DFS(int numberOfVerticesa) {
		numberOfVertices=numberOfVerticesa;
		integers=new LinkedList[numberOfVertices];
		
		for (int i = 0; i < integers.length; i++) {
			integers[i]=new LinkedList<Integer>();
		}
		
	}

	
	
	public void addEdge(int vertex, int adjacentVertex){
		
		integers[vertex].add(adjacentVertex);
		
	}
	
	
	
	public void dfSearch(int sourceVertex){
		
		boolean[] visited = new boolean[numberOfVertices];
		
		int[] visited2 = new int[numberOfVertices];
		
		System.out.println(Arrays.toString(visited));
		
		 // Call the recursive helper function to print DFS traversal
        DFSUtil(sourceVertex, visited);
		
	}
	
	
	private void DFSUtil(int sourceVertex, boolean[] visited) {
		// TODO Auto-generated method stub
		
		System.out.println("i--"+sourceVertex);
		visited[sourceVertex]=true;
	Iterator<Integer> iterator=	integers[sourceVertex].iterator();
	
	  while (iterator.hasNext()){
		  int n = iterator.next();
		  
		  if (!visited[n]) {
			  DFSUtil(n, visited);
		}
		
	}
	
		
		
	}



	public static void main(String[] args) {
	DFS dfs=new DFS(4);	


	dfs.addEdge(0, 1);
	dfs.addEdge(0, 2);
	dfs.addEdge(1, 2);
	dfs.addEdge(2, 0);
	dfs.addEdge(2, 3);
	dfs.addEdge(3, 3);

	dfs.dfSearch(2);
	
	}

}
