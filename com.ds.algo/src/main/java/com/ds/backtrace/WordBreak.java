package com.ds.backtrace;

public class WordBreak {

	public static void main(String[] args) {
		String[] dictionary = { "I", "have", "Jain", "Sumit", "am", "this", "dog" };
		for (int i = 0; i < dictionary.length; i++) {

		}

		String word = "IamSumit";

		String newString = "";
		breakWord(dictionary, word, 0, newString);

	}

	private static void breakWord(String[] dictionary, String word, int k, String newString) {

		for (int i = 0; i < dictionary.length; i++) {

			String dicWord = dictionary[i];

			if (wordExist(word, dicWord, newString)) {
				System.out.println("true");
			} else {

				System.out.println("false");
			}

		}

	}

	private static boolean wordExist(String word, String dicWord, String matchString) {
		if (dicWord.equalsIgnoreCase(matchString)) {
			return true;
		}

		if (word.length() == 0) {
			return false;
		}

		if (dicWord.charAt(matchString.length()) == word.charAt(0)) {
			matchString = matchString + dicWord.charAt(matchString.length());
		} else {
			matchString = "";
		}
		return wordExist(word.substring(1, word.length()), dicWord, matchString);

	}
}
