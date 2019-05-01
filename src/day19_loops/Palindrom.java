package day19_loops;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String reversed = "";
		int idx = word.length()-1;
		while(idx>=0) {
			System.out.print(word.charAt(idx));
			reversed += word.charAt(idx);
			idx--;
			
		}
		System.out.println();
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("Word u entered is palindrom");
		}else {
			System.out.println("Word u entered is NOT palindrom");
		}
	}

}
