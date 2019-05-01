package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int secretPinCode = 1234;
		System.out.println("Enter pin-code");
		int pinCode = scan.nextInt();
		int attempts = 1;
		while(pinCode != secretPinCode && attempts <=3) {
			System.out.println("Enter pin-code");
			pinCode = scan.nextInt();
			attempts++;
			
			if(attempts ==3 && pinCode != secretPinCode) {
				System.out.println("Card is blocked");
				return;
			}
		}
		System.out.println("Access granted\nSelect operation");
	}

}
