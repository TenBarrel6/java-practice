package day08_casting_conditionlas;

import java.util.Scanner;

public class IfElseWithVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int temperature = 65;
		
		if(temperature>=65) {
			System.out.println("It's a nice day!");
		}else {
			System.out.println("Stay home and code java");
		}
		System.out.println("Enter team A score:");
		int teamAScore = scan.nextInt();
		System.out.println("Enter team B score:");
		int teamBScore = scan.nextInt();
		if (teamAScore>teamBScore) {
			System.out.println("Team A Won");
		}else if(teamAScore<teamBScore){
			System.out.println("Team B Won");
		}else {
			System.out.println("Draw game!");
		}

	}

}
