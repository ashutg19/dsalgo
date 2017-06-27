package com.ds.backtrace;

public class WordMatrix {
	public int[][] solution;
	int path = 1;

	public WordMatrix(int N) {
		solution = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				solution[i][j] = 0;
			}
		}
	}

	public boolean searchWord(char[][] matrix, String word) {
		int N = matrix.length;

		

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == word.charAt(0)) {

					if (searchChar(matrix, i, j, word, 0, N)) {
						return true;
					}

				}
			}
		}

		return false;
	}

	private boolean searchChar(char[][] matrix, int i, int j, String word, int k, int N) {
		
		if (k>=word.length()) {
			return true;
		}

		if (matrix[i][j] == word.charAt(k) && solution[i][j] != 1) {
			solution[i][j] = 1;
		}else{
			return false;
		}

		if (canMove(i+1, j, N) && searchChar(matrix,i+1,j,word,k+1,N)) {
			return true;
		}
		if (canMove(i + 1, j, N) &&  searchChar(matrix,i-1,j,word,k+1,N)) {
			return true;
		}
		if (canMove(i,j+1, N) &&  searchChar(matrix,i,j+1,word,k+1,N)) {
			return true;
		}
		if (canMove(i,j-1, N) &&  searchChar(matrix,i,j-1,word,k+1,N)) {
			return true;
		}
		if (canMove(i-1,j+1, N) &&  searchChar(matrix,i-1,j+1,word,k+1,N)) {
			return true;
		}
		if (canMove(i-1,j-1, N) &&  searchChar(matrix,i-1,j-1,word,k+1,N)) {
			return true;
		}
		if (canMove(i+1,j-1, N) &&  searchChar(matrix,i+1,j-1,word,k+1,N)) {
			return true;
		}
		if (canMove(i+1,j+1, N) &&  searchChar(matrix,i+1,j+1,word,k+1,N)) {
			return true;
		}
		solution[i][j] = 0;
		return false;
	}

	private boolean canMove(int i, int j, int N) {
		if (i >= 0 && j >= 0 && i < N && j < N) {
			return true;
		}
		return false;
	}

	public void print() {
		for (int i = 0; i < solution.length; i++) {
			for (int j = 0; j < solution.length; j++) {
				System.out.print(" " + solution[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char[][] matrix = { { 't', 'z', 'x', 'c' }, { 'a', 'h', 'n', 'z' }, { 'h', 'w', 'o', 'i' },
				{ 'o', 'r', 'n', 'r' } };
		WordMatrix w = new WordMatrix(matrix.length);

		if (w.searchWord(matrix, "ashishs")) {
			w.print();
		} else {
			System.out.println("NO PATH FOUND");
		}

	}
}
