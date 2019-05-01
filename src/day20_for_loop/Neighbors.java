package day20_for_loop;

import java.util.Scanner;

public class Neighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();
		char myChar = '1';
		for(int i = 0; i<word.length()-1; i++) {
			if(word.charAt(i)==word.charAt(i+1)) {
				myChar = word.charAt(i);
				System.out.println("Beeeep - "+myChar);
			}
		}
		
//		for(int i = 0; i < word.length()-1; i++) {
//			if(word.charAt(i) == word.charAt(i + 1)) {
//				System.out.println("Beeep - " + word.charAt(i));
//			}
//		} 

	}

}
