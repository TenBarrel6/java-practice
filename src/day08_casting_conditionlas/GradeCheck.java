package day08_casting_conditionlas;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your grade?");
		char grade = scan.next().toUpperCase().charAt(0);
		
		if (grade=='A') {
			System.out.println("Exellent Job! Keep it up!");
		}else {
			System.out.println("You grade "+grade+" is not good enough.");
			System.out.println("How many points did you miss for 'A'?");
			int points = scan.nextInt();
			System.out.println("You could earn "+points+" more points if you studiet harder!");
		}
		
		
		

	}

}
