package com.ds.problems;

public class MinimumCostPathProblem {

	public static int find(int[][] A, int row, int col, int i, int j) {

		if (i == row - 1 && j == col - 1) {
			return A[i][j];
		}

		if (i == row - 1) {
			return A[i][j] + find(A, 3, 2, i, j + 1);
		}
		if (j == col - 1) {
			return A[i][j] + find(A, 3, 2, i + 1, j);
		}

		int a = find(A, 3, 2, i + 1, j);
		int b = find(A, 3, 2, i, j + 1);
		int c = A[i][j] + Math.min(a, b);

		return c;
	}

	public static void main(String[] args) {
		int[][] A = { {5 ,1 }, { 1,1 }, { 6, 10 } };
		System.out.println("Minimum Cost Path " + find(A, 3, 2, 0, 0));
	}

}
