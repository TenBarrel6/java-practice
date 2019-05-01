package day12_switch_ternary;
import java.util.*;
public class SwitchScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		switch(score) {
		case 1:
			System.out.println("score is 1");
			break;
		case 2:
			System.out.println("score is 2");
			break;
		case 3:
			System.out.println("score is 3");
			break;
		default: //Like ELSE for if statement
			System.out.println("Invalid score");
			break;
		}
		

	}

}
