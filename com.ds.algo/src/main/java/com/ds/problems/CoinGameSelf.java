package com.ds.problems;

public class CoinGameSelf {

	public static int solve(int[] A,int i, int j) {
	
		
		if (i==j) {
			return A[i];
		}
		if (j==i+1){
			return Math.max(A[i],A[j]);
		}
		
	   return Math.max(A[i]+Math.min(solve(A,i+2, j),solve(A,i+1, j-1)),A[j]+Math.min(solve(A,i+1, j-1),solve(A,i, j-2)));
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] B = {6, 9, 1, 2, 16, 8};
		System.out.println("Max value pick up by player1(Alice) " + solve(B,0,B.length-1));
	}
}
