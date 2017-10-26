package com.ds.sort;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		
		int []array={2,4,5,6,78,1};
		
		bubbleSort(array);
		
	}

	private static void bubbleSort(int[] array) {
		
		
		
		
		
		for (int i = 0; i < array.length-1; i++) {
			
			
			
			for (int j = 0; j < array.length-1; j++) {
				
				
				if (array[j]>array[j+1]) {
					int k = array[j+1];
					array[j+1]=array[j];
					array[j]=k;
				}
				
				
				
			}
			
			
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
	}
	
	
}
