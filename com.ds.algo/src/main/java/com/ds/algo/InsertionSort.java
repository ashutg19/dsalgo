package com.ds.algo;

public class InsertionSort {

	
	public static void main(String[] args) {
		
		
		int []array={9,7,6,15,16,5,10,11};
		
		selectionSort(array);
		
	}

	private static void selectionSort(int[] array) {
		
			
			for (int j = 1; j < array.length; j++) {
				
				int k=j;
				int i=k-1;
		
				if (array[k]<array[i]) {
					
					for (; i >=0; i--) {
						if (array[i]>array[k]) {
							int t = array[k];
							array[k]=array[i];
							array[i]=t;
							k--;
						}else{
							break;
						}
					}
					
				}
				
			}
			
			
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
	}
	
	
}
