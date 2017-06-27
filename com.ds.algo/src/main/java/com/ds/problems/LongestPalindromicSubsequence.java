package com.ds.problems;

public class LongestPalindromicSubsequence {

	public int findPalindrome(String s1, int i,int j) {
		
		
		if (i==j) {
			return 1;
		}
		
		
//	if (i+1==j) {
//			return 2;
//		}
		
		if (s1.charAt(i)==s1.charAt(j)) {
			return 2+findPalindrome(s1,i+1,j-1);
		}
		
		
		return Math.max(findPalindrome(s1,i,j-1), findPalindrome(s1,i+1,j));
	}

	public static void main(String[] args) {

		LongestPalindromicSubsequence editProblem = new LongestPalindromicSubsequence();
		String one = "LongestPalindromicSubsequence";

		System.out.println("Output---" + editProblem.findPalindrome(one,0, one.length()-1));

	}

}
