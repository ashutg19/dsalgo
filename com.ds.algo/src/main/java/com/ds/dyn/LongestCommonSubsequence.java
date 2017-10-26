package com.ds.dyn;

import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(findLongestCommonSubsequence(sc.nextLine(), sc.nextLine()));
		sc.close();
	}

	private static int findLongestCommonSubsequence(String fruit1, String fruit2) {
		
		int fruit1Length=fruit1.length();
		int fruit1Length2=fruit2.length();
		int[][] solution = new int[fruit1Length+1][fruit1Length2+1];
		
		for (int i = 1; i <= fruit1Length; i++) {

			for (int j = 1; j<= fruit1Length2; j++) {

				if (fruit1.charAt(i-1) == fruit2.charAt(j-1)) {

						solution[i][j] = 1 + solution[i - 1][j - 1];

				}
				else{
					
					solution[i][j] = Math.max(solution[i][j-1], solution[i-1][j]);
					
				}

			}

		}
		return solution[fruit1Length][fruit1Length2];
		
	}

}
