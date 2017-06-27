package com.ds.problems;


public class SmallSquare {

	public void smallSquare(int number) {

		
		int maxSquare=0;
		
		
		for (int i = 0; ;i++) {
			if ((i*i)>number) {
				maxSquare=i;
				break;
			}
		}
		
		
		int squareArray[]=new int[maxSquare+1];
		
		for (int i = 0; i < squareArray.length; i++) {
			squareArray[i]=i*i;
		}
		
		
		
	while (number>=1) {

		for (int i = 0; i <= squareArray.length; i++) {
			if (squareArray[i]>number) {
				
				System.out.println("First number-"+(i-1));
				
				number=number-squareArray[i-1];
				break;
			}
		}
		
		
		
		
	}
		
		
		
	
	}

	public static void main(String[] args) {
		int number = 28;
		SmallSquare m = new SmallSquare();
		m.smallSquare(number);
	}
}
