package day31_methods03;

import day15_string_manipulation.GoogleSearchTest;

public class MethodsWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countWords("Java is fan");
		googleSearchResults("about 120,000,000 results (0.75 seconds)");
	}
	
	public static void countWords(String sentence) {
		String[] arrSentence = sentence.split(" ");
		System.out.println("Number of words: "+arrSentence.length);
	}
	
	public static void googleSearchResults(String str) {
		String[] resArr = str.split(" ");
		System.out.println("Rsults count: "+resArr[1].replaceAll(",", ""));
		System.out.println("Time in seconds: "+resArr[3].substring(1)); 
	}

}
