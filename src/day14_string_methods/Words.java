package day14_string_methods;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word:");
		String word1 = scan.next();
		System.out.println("Enter second word:");
		String word2 = scan.next();
		
		if(word1.length()>word2.length()) {
			System.out.println(word1+" is longer");
		}else if(word1.length()<word2.length()) {
			System.out.println(word2+" is longer");
		}else {
			System.out.println(word1+" and "+word2+" are same length");
		}

	}

}
