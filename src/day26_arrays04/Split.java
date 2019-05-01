package day26_arrays04;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "java, kava, scan, html, selenium";
		String[] wordsArray = words.split(", ");
		System.out.println(Arrays.toString(wordsArray));
		System.out.println("Count: "+wordsArray.length);
		
		String diceResult = "1 - 20 of 1,461 positions";
		//using split method, print 1,461
		String[] diceArray = diceResult.split(" ");
		System.out.println("Search results total: " + diceArray[4]);
		
		String sentence = "I felt happy because I saw the others were happy "
				+ "and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		
		System.out.println(Arrays.toString(allWords));
		System.out.println(Arrays.toString(happySplit));
		System.out.println(Arrays.toString(ISplit));
		System.out.println("********");
		for(String t:allWords) {
			System.out.println(t);
		}
		System.out.println("*********");
		String word = "Java";
		char[] charsArray = word.toCharArray();
		for(char ch:charsArray) {
			System.out.println(ch);
		}
	}

}
