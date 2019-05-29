package day47_blocks;

import java.time.LocalDateTime;
import static day47_blocks.TestData.*;
public class BriteErp {
	static {
		System.out.println("Launch Browser");
		System.out.println("Navigate to: "+url);
	}
	
	public static void enterEmail() {
		System.out.println("Enter email: "+email);
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: "+password);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected name "+userName);
		System.out.println("Actual Name displayed: Viktoriia Lugovska");
		System.out.println("Login successful - "+LocalDateTime.now());
	}
}
