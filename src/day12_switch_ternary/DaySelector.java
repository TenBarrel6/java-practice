package day12_switch_ternary;

import java.util.Scanner;

public class DaySelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day:");
		int day = scan.nextInt();
		switch(day) {
		case 1:
			System.out.println("It is Monday");
			break;
		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursday");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		case 7:
			System.out.println("It is Sunday");
			break;
		default: //Like ELSE for if statement
			System.out.println("Not a such day");
			break;
		}

	}

}
