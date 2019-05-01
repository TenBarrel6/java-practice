package day06_operators2;

import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //create Scanner object, import it from Java.Util
		// u can ^^^ name scanner as u wish
		System.out.println("Enter a number:");
		
			int number = input.nextInt(); 
			// that's    ^^^^^ - name of ur scanner 
			
			System.out.println("You entered: "+number);
		
	

	}

}
