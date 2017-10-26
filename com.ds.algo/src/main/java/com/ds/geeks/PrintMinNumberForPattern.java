package com.ds.geeks;

public class PrintMinNumberForPattern {

	public static void main(String[] args) {

		String inputPattern = "DDIDDIID";

		PrintMinNumberForPattern forPattern = new PrintMinNumberForPattern();

		int[] patternArray = new int[inputPattern.length() + 1];

		int numberUsed = 0;
		int locationFilled = 0;
		int patternReadIndex = 0;
		if (inputPattern.charAt(0) == 'D') {
			int D = forPattern.getConSecutiveD(inputPattern, 0);
			patternReadIndex = D;
			D = D + 1;
			numberUsed = D;
			for (int i = D; i > 0; i--) {
				patternArray[locationFilled] = i;
				locationFilled++;
			}
			locationFilled--;
		} else {
			patternArray[locationFilled] = 1;
			numberUsed = 1;
			// patternReadIndex=1;
		}

		forPattern.printNumber(inputPattern, patternArray, locationFilled, numberUsed, patternReadIndex);

	}

	private void printNumber(String inputPattern, int[] patternArray, int locationFilled, int numberUsed,
			int patternReadIndex) {

		PrintMinNumberForPattern forPattern = new PrintMinNumberForPattern();

		for (int i = patternReadIndex; i < inputPattern.length();) {

			if (inputPattern.charAt(i) == 'I' && (inputPattern.length() - 1 == i) ? true
					: inputPattern.charAt(i + 1) == 'I') {
				locationFilled = locationFilled + 1;
				numberUsed = numberUsed + 1;
				patternArray[locationFilled] = numberUsed;
				patternReadIndex = patternReadIndex + 1;
				i=patternReadIndex;
			} else {
				int D=forPattern.getConSecutiveD(inputPattern, i+1);
				patternReadIndex =patternReadIndex+ D + 1;
				i=patternReadIndex;
//				int D = numberUsed + forPattern.getConSecutiveD(inputPattern, 0);
				numberUsed = numberUsed + D+1;
				int interNumberused = numberUsed;
				for (int j = 0; j < D + 1; j++) {
					locationFilled = locationFilled + 1;
					patternArray[locationFilled] = interNumberused;
					interNumberused--;
				}

			}

		}

		System.out.println("the end---");

		for (int i = 0; i < patternArray.length; i++) {
			System.out.println(patternArray[i]);
		}

	}

	private int getConSecutiveD(String inputPattern, int initialIndex) {

		int D = 0;

		for (int i = initialIndex; i < inputPattern.length(); i++) {
			if (inputPattern.charAt(i) == 'D') {
				D++;
			} else {
				break;
			}
		}

		// TODO Auto-generated method stub
		return D;
	}

}
