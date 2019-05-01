package day12_switch_ternary;

import java.util.Scanner;

public class Calculator_v02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number:");
		double num2 = scan.nextDouble();
		//Get operator
		System.out.println("Select operator: +, -, *, /, %");
		String operator = scan.next();
		switch(operator) {
		case "+":
			System.out.println("Result is: "+(num1+num2));
			break;
		case "-":
			System.out.println("Result is: "+(num1-num2));
			break;
		case "*":
			System.out.println("Result is: "+(num1*num2));
			break;
		case "/":
			System.out.println("Result is: "+(num1/num2));
			break;
		case "%":
			System.out.println("Result is: "+(num1%num2));
			break;
				default:
			System.out.println("NO exhisting operator!");

		}
		
	System.out.println("#### END OF PROGRAM ####");

	}

}
