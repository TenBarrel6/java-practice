package day15_string_manipulation;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type an emoji");
		String ch = scan.next();
		
		if(ch.length() !=2) {
			System.out.println("Invalid emoji");
			return;
		}
		if(ch.charAt(0)==(':')&&ch.charAt(1)==(')')) {
			System.out.println("Smile");
		}else if(ch.charAt(0)==(':')&&ch.charAt(1)==('(')) {
			System.out.println("Sad");
		}else if(ch.charAt(0)==(':')&&ch.charAt(1)==('/')) {
			System.out.println("Upset");
		}else if(ch.charAt(0)==(':')&&ch.charAt(1)==('p')) {
			System.out.println("Playfull");
		}else if(ch.charAt(0)==(';')&&ch.charAt(1)==(')')) {
			System.out.println("Wink");
		}else if(ch.charAt(0)==(';')&&ch.charAt(1)==('0')) {
			System.out.println("Surprised");
		}else {
			System.out.println("Invalid emoji");
		}
		
//		switch(ch.charAt(0)) {
//			case ':':
//				switch(ch.charAt(1)) {
//				case ')': System.out.println("Smile");
//				break;
//				case '(': System.out.println("Sad");
//				break;
//				case '/': System.out.println("Upset");
//				break;
//				case 'p': System.out.println("Playfull");
//				break;
//				}
//			break;
//			case ';':
//				switch(ch.charAt(1)) {
//				case ')': System.out.println("Wink");
//				break;
//				case '0': System.out.println("Surprised");
//				break;
//				}
//			break;
//			default: System.out.println("Invalid emoji");
//			break;
//		}

	}

}
