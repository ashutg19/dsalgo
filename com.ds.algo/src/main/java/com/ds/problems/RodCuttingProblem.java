package com.ds.problems;

public class RodCuttingProblem {
	
	
	
	public static int profit(int[] value, int length) {
		if (length <= 0)
			return 0;
			// either we will cut it or don't cut it
			int max = -1;
			for(int i=0;i<length;i++)
				max = Math.max(max, value[i] + profit(value, length-(i+1)));			
			return max;		
	}
	
	
	
	public static int profitMy(int[] value, int length) {
		if (length <= 0)
			return 0;
			// either we will cut it or don't cut it.
			int max = Math.max(profitMy(value,length-1)+value[0],value[length]);			
			return max;		
	}
	
	
	
	public static void main(String[] args) {
		int[] value = { 1,5,8,9 };
		int len = 4;
		System.out.println("Max profit for length is " + len + ":"
				+ profitMy(value, len-1));

	}
}
