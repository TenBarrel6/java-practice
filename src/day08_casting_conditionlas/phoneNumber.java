package day08_casting_conditionlas;

import java.util.Scanner;

public class phoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your area code: ");
		int areaCode = scan.nextInt();
	    System.out.println("Enter your local number: ");
		int localNumber = scan.nextInt();
	    String phoneNumber = "Calling number ("+areaCode+")-"+localNumber;
	    System.out.println(phoneNumber);

	}

}
