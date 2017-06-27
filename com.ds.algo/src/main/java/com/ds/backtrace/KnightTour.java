package com.ds.backtrace;

import java.text.DecimalFormat;

public class KnightTour {

	
	int[][] solution;
	int path = 0;

	public KnightTour(int N) {
		solution = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				solution[i][j] = 0;
			}
		}
	}


	private void solve() {
		if (findPath(0, 0, 0, solution.length)) {
			print();
		} else {
			System.out.println("NO PATH FOUND");
		}
	}
	
	
	public boolean findPath(int i, int j, int index, int N) {
		
		
		
		
		if (solution[i][j] != 0) {
			return false;
		}
		
		solution[i][j] = path++;
		
		if (index == N * N - 1) {
			// if we are here means we have solved the problem
			return true;
		}
		
		//move down and right
		
		
		if (canMove(i+2,j+1,N) &&findPath(i+2,j+1,index+1,N)) {
			return true;
		}
		
		if (canMove(i + 1, j + 2, N)
				&& findPath(i + 1, j + 2, index + 1, N)) {
			return true;
		}
		// go right and up
		if (canMove(i - 1, j + 2, N)
				&& findPath(i - 1, j + 2, index + 1, N)) {
			return true;
		}
		// go up and right
		if (canMove(i - 2, j + 1, N)
				&& findPath(i - 2, j + 1, index + 1, N)) {
			return true;
		}
		// go up and left
		if (canMove(i - 2, j - 1, N)
				&& findPath(i - 2, j - 1, index + 1, N)) {
			return true;
		}
		// go left and up
		if (canMove(i - 1, j - 2, N)
				&& findPath(i - 1, j - 2, index + 1, N)) {
			return true;
		}
		// go left and down
		if (canMove(i + 1, j - 2, N)
				&& findPath(i + 1, j - 2, index + 1, N)) {
			return true;
		}
		// go down and left
		if (canMove(i + 2, j - 1, N)
				&& findPath(i + 2, j - 1, index + 1, N)) {
			return true;
		}
		// if we are here means nothing has worked , backtrack
		solution[i][j] = 0;
		path--;
		return false;
		
	}
	
	public boolean canMove(int i, int col, int N) {
		if (i >= 0 && col >= 0 && i < N && col < N) {
			return true;
		}
		return false;
	}
	
	public void print() {
		DecimalFormat twodigits = new DecimalFormat("00");
		for (int i = 0; i < solution.length; i++) {
			for (int j = 0; j < solution.length; j++) {
				System.out.print("   " + twodigits.format(solution[i][j]));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int N = 8;
		KnightTour i = new KnightTour(N);
		i.solve();
	}






}
