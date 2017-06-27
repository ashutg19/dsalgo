package com.ds.problems;

public class SplitStringIntoMAX {

	public static void main(String[] args) {
		String string = "ABCD";
		System.out.println("Total"+splitRecursionString(string));

	}

	public static void splitString(String arg) {

		for (int i = 0; i < arg.length(); i++) {

			for (int j = i; j < arg.length(); j++) {

				System.out.println(arg.substring(i, j + 1));

			}

		}

	}

	public static int splitRecursionString(String arg) {

		if(arg=="" || isPalindrome(arg)){
		System.out.println(arg);
			return 0;
		}

		else {
			int cuts = Integer.MAX_VALUE;
			for (int i = 1; i <arg.length() ; i++) {
				System.out.println(arg);
//				cuts  = Math.min(1+ splitRecursionString(arg.substring(0, arg.length()-1)),
//					splitRecursionString(arg.substring(1, arg.length())));
				
				cuts  = Math.min(1+ splitRecursionString(arg.substring(0, i)) + splitRecursionString(arg.substring(i, arg.length())),cuts);
			}
				return cuts;
			// }
		}

	}

	public static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < (n / 2) + 1; ++i) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
