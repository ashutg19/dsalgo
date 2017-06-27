package com.ds.backtrace;

public class NQueensBT {
int [][] solution;
	public NQueensBT(int n) {
		int [][] solution=new int [n][n];
	}

	public static void main(String[] args) {
		
		int N=4;
		NQueensBT nQueensBT=new NQueensBT(N);
		
		
		nQueensBT.placeQueen(N,0,0);

	}

	private void placeQueen(int n,int row,int col) {
		
		
		if (pathExist(n,row,col)) {
			solution[row][col]=1;
		}
		
		placeQueen(n,row+1,col);
		
		
		
	}
	
	
	
public boolean	pathExist(int n,int row,int col){
	
	int refCol=0;
	while (refCol<col) {
		if (solution[row][refCol]==1) {
			return false;
		}
		
	}
	
	
	while(row==0){
		if (solution[row-1][col-1]==1) {
			return false;
		}
		row=row-1;
		col=col-1;
	}
	
	
	while(row<n){
		if (solution[row+1][col-1]==1) {
			return false;
		}
		row=row+1;
		col=col-1;
	}
	
	
	
	return true;
		
	}

}
