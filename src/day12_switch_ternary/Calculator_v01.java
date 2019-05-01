package day12_switch_ternary;
import java.util.*;
public class Calculator_v01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number:");
		double num2 = scan.nextDouble();
		//Get operator
		System.out.println("Select operator: +, -, *, /, %");
		String operator = scan.next();
		
		if (operator.equals("+")) {
			System.out.println("The result is: "+(num1+num2));
		}else if (operator.equals("-")) {
			System.out.println("The result is: "+(num1-num2));
		}else if (operator.equals("*")) {
			System.out.println("The result is: "+(num1*num2));
		}else if (operator.equals("/")) {
			System.out.println("The result is: "+(num1/num2));
		}else if (operator.equals("%")) {
			System.out.println("The result is: "+(num1%num2));
		}
	}
}
