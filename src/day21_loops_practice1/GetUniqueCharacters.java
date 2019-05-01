package day21_loops_practice1;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String unique = "";
		
		for(int i = 0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(!unique.contains(""+ch)) {
				unique += ch; 
				
			}
		}
		System.out.println(unique);
	}

}
