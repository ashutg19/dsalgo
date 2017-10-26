package com.ds.sort;

public class SelectionSort {

	
	public static void main(String[] args) {
		
		
		int []array={2,4,5,6,78,1};
		
		selectionSort(array);
		
	}

	private static void selectionSort(int[] array) {
		
		
		
		
		
		for (int i = 0; i < array.length-1; i++) {
			
			
			
			for (int j = i; j < array.length; j++) {
				
				
				if (array[i]>array[j]) {
					int k = array[j];
					array[j]=array[i];
					array[i]=k;
				}
				
				
				
			}
			
			
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
	}
	
	
}
