package day23_loops_and_arreys;

import java.util.Scanner;

public class WordsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "";
		String word = "";
		for(int i = 0; i < 6; i++) {
			System.out.println("Enter the word:");
			word = scan.next();
			if(word.equalsIgnoreCase("java")){
				continue;
			}
			str+=", "+word;
		}
		System.out.println("result: "+str.replaceFirst(", ", ""));
	}

}
