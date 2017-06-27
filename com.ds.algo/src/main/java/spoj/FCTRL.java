package spoj;

import java.util.Scanner;

public class FCTRL {
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count= Integer.parseInt(sc.nextLine());
		int[] numbers=new int[count];
		for (int i = 0; i < count; i++) {
			int number= Integer.parseInt(sc.nextLine());
			numbers[i]=number;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			int n=5;
			int sum=0;
			while(numbers[i]/n>0){
				sum=sum+numbers[i]/n;
				n=n*5;
			}
			System.out.println(sum);
			
		}
		
		
		
	}
	
	
	

}
