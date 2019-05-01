package day11_logical_nestedif;
import java.util.*;
public class LogInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String validUsername = "CyberTek";
		String validPassword = "12345qwe";
		System.out.println("Enter username and password");
		String username = scan.nextLine();
		String password = scan.nextLine();
		
		if (username.equalsIgnoreCase(validUsername)&&password.contentEquals(validPassword)) {
			System.out.println("Login Successful, Welcome!");
		}else if (!username.equalsIgnoreCase(validUsername)&&!password.equalsIgnoreCase(validPassword)) {
			System.out.println("Invalid Username and Inavalid Password");
		}else if (!username.equalsIgnoreCase(validUsername)&&password.contentEquals(validPassword)) {
			System.out.println("Invalid Username");
		}else if (username.contentEquals(validUsername)&&!password.equalsIgnoreCase(validPassword)) {
			System.out.println("Inavalid Password");
		}
		
		

	}

}
