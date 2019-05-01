package day23_loops_and_arreys;

import java.util.Scanner;

public class BruteForceAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 5;
		String userName = "admin";
		String password = "admin123";
		String user = "";
		String pass = "";
		
		do {
			if(count == 0) {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!You have exceeded number of attempts!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				return;
			}
			System.out.println("Enter username:");
			user = scan.nextLine();
			if(!user.equalsIgnoreCase(userName)) {
				System.out.println("**********************");
				System.out.println("Wrong username!");
				System.out.println("Attempts left: "+count);
				System.out.println("**********************\n");
			}
			
			if(user.equalsIgnoreCase(userName)) {
				do {
					System.out.println("###############");
					System.out.println("Enter password:");
					pass = scan.nextLine();
					if(!pass.equalsIgnoreCase(password)) {
						System.out.println("**********************");
						System.out.println("Wrong password!");
						System.out.println("Attempts left: "+count);
						System.out.println("**********************\n");
					}
					count--;
				}while(!pass.equalsIgnoreCase(password));
			}
			
			
			count--;
			
		}while(!user.equalsIgnoreCase(userName)||!pass.equalsIgnoreCase(password));
		
		if(user.equalsIgnoreCase(userName)&&pass.equalsIgnoreCase(password)) {
			System.out.println("*****************");
			System.out.println("Login Succsessful\n");
			System.out.println("*****************");
		}
	}

}
