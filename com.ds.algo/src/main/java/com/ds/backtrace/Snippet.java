package com.ds.backtrace;

public class Snippet {
	public boolean isSafeToGo(int[][] maze, int x, int y, int N) {
			// check if x and y are in limits and cell is not blocked
			if (x >= 0 && y >= 0 && x < N  && y < N && maze[x][y] != 0) {
				return true;
			}
			return false;
		}
}

