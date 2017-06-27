package com.ds.problems;

public class StringEditProblem {

	public int editDistanceRecursion(String s1, String s2, int m, int n) {

		if (m == 0) {
			return n;
		}
		if (n == 0) {
			return m;
		}

		if (s1.charAt(m-1) == s2.charAt(n-1)) {
			return editDistanceRecursion(s1, s2, m - 1, n - 1);
		}

		int a = editDistanceRecursion(s1, s2, m, n - 1);

		int b = editDistanceRecursion(s1, s2, m - 1, n);

		int c = editDistanceRecursion(s1, s2, m - 1, n - 1);

		return 1 + Math.min(a, Math.min(b, c));

	}

	public static void main(String[] args) {

		StringEditProblem editProblem = new StringEditProblem();
		String one = "horizon";
		String two = "horizontal";

	System.out.println("Output---"+	editProblem.editDistanceRecursion(one, two, one.length(), two.length()));

	}

}
