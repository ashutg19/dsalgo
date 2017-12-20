package com.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {

	private List<Edge<T>> allEdges;
	private Map<Long, Vertex<T>> allVertex;

	boolean isDirected = false;

	public Graph(boolean isDirected) {
		allEdges = new ArrayList<Edge<T>>();
		allVertex = new HashMap<Long, Vertex<T>>();
		this.isDirected = isDirected;
	}

	public void addEdge(long id1, long id2) {
		addEdge(id1, id2, 0);
	}

	public void addEdge(long id1, long id2, int weight) {

		Vertex<T> vertex1 = null;

		if (allVertex.get(id1) != null) {
			vertex1 = allVertex.get(id1);
		} else {
			vertex1 = new Vertex<T>(id1);
			allVertex.put(id1, vertex1);
		}

		Vertex<T> vertex2 = null;

		if (allVertex.get(id2) != null) {
			vertex2 = allVertex.get(id2);
		} else {
			vertex2 = new Vertex<T>(id2);
			allVertex.put(id2, vertex2);
		}

		Edge<T> edge = new Edge<T>(vertex1, vertex2, isDirected, weight);
		allEdges.add(edge);
		vertex1.addAdjacentVertex(edge, vertex2);
		vertex1.getAdjacentVertex().add(vertex2);

	}

}

class Vertex<T> {
	long id;
	private T data;
	private List<Edge<T>> edges = new ArrayList<>();
	private List<Vertex<T>> adjacentVertex = new ArrayList<>();

	public void addAdjacentVertex(Edge<T> e, Vertex<T> v) {
		edges.add(e);
		adjacentVertex.add(v);
	}

	Vertex(long id) {
		this.id = id;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<Edge<T>> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge<T>> edges) {
		this.edges = edges;
	}

	public List<Vertex<T>> getAdjacentVertex() {
		return adjacentVertex;
	}

	public void setAdjacentVertex(List<Vertex<T>> adjacentVertex) {
		this.adjacentVertex = adjacentVertex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
	
	
	
}

class Edge<T> {
	private boolean isDirected = false;
	private int weight;
	private Vertex<T> vertex1;
	private Vertex<T> vertex2;

	Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected, int weight) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.weight = weight;
		this.isDirected = isDirected;
	}

	public Vertex<T> getVertex1() {
		return vertex1;
	}

	public void setVertex1(Vertex<T> vertex1) {
		this.vertex1 = vertex1;
	}

	public Vertex<T> getVertex2() {
		return vertex2;
	}

	public void setVertex2(Vertex<T> vertex2) {
		this.vertex2 = vertex2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vertex1 == null) ? 0 : vertex1.hashCode());
		result = prime * result + ((vertex2 == null) ? 0 : vertex2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (vertex1 == null) {
			if (other.vertex1 != null)
				return false;
		} else if (!vertex1.equals(other.vertex1))
			return false;
		if (vertex2 == null) {
			if (other.vertex2 != null)
				return false;
		} else if (!vertex2.equals(other.vertex2))
			return false;
		return true;
	}
	
	
	
	

}