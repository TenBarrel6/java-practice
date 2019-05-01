package day19_loops;

import java.util.Scanner;

public class EnterPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;
		int count = 0;
		do {
			count++;
			System.out.println("Enter password");
			input = scan.next();
		}while(!input.equals(password)&&count<3);
		System.out.println("u r out of trys app blocked");
		
	}

}
