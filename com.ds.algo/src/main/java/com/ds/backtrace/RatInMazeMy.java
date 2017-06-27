package com.ds.backtrace;

public class RatInMazeMy {

	int[][] solution;

	public RatInMazeMy(int N) {
		solution = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				solution[i][j] = 0;
			}
		}

	}

	private void solveMaze(int[][] maze, int n) {

		if (findPath(maze, 0, 0, "down", n)) {
			print(solution, n);

		} else {

			System.out.println("not solved");
		}
	}

	private boolean findPath(int[][] maze, int i, int j, String direction, int n) {

		if (i == n - 1 && j == n - 1) {
			// reached final
			solution[i][j] = 1;
			return true;

		}
		if (pathExist(maze, i, j, n)) {

			solution[i][j] = 1;

			if (direction!="up" &&findPath(maze, i + 1, j, "down", n)) {
				return true;
			}

			if (direction!="left" && findPath(maze, i, j + 1, "right", n)) {
				return true;
			}

			if (direction!="down" &&findPath(maze, i - 1, j, "up", n)) {
				return true;
			}

			if (direction!="right" && findPath(maze, i, j - 1, "left", n)) {
				return true;
			}

			return false;
		}
		// TODO Auto-generated method stub
		return false;
	}

	private boolean pathExist(int[][] maze, int i, int j, int n) {

		if (i >= 0 && j >= 0 && i < n && j < n && maze[i][j] != 0) {
			return true;
		}

		return false;
	}

	public void print(int[][] solution, int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(" " + solution[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int N = 4;
		int[][] maze = { { 1,1,1,0 }, { 0,0,1,0,0 }, { 0,1,1,1 }, { 0, 0, 0, 1 }
			 };
		RatInMazeMy r = new RatInMazeMy(N);
		r.solveMaze(maze, N);
	}

}