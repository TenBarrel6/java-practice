package day10_logicaloperators_conditionals;

public class IFStatmentWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isBreakeTime = true;
		if (isBreakeTime==true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yet.");
		}
		// SECOND VERSION
		if (isBreakeTime) {
		System.out.println("BREAK TILL 8:35 PM");
		}else {
		System.out.println("Not Break time yet.");
		}
		//
		boolean classTime = true;
		
		if (classTime) {
			System.out.println("Come back on time");
			System.out.println("stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
		
		}else {
			System.out.println("Take a walk and have some water.");
		}
		
		boolean qualified = false;
		//send a notification message if not qualified
		// we need to check if qualified variable contains FALSE
		if (qualified==false) {
			System.out.println("Your application was not approved. Good luck!");
		}
	}

}
