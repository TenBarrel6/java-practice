package day52_inheritance05;

public class FinalVariables {
	public final int ROADSTER_MAX_RANGE;
	public final int MODEL3_MAX_SPEED = 210;
	public final int MODELX_PASSANGERS;
	public final String JAN = "January";
	public static final String COMPANY_NAME = "CyberTek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin";
	}
	
	public FinalVariables() {
		ROADSTER_MAX_RANGE = 610;
	}
	
	/*
		public FinalVariables(int max) {
			ROADSTER_MAX_RANGE = max;
		}
	 */
	
	{
		MODELX_PASSANGERS = 7;
		
	}
	
	public static void main(String[] args) {
		final int MAX_PASSANGERS_COUNT = 5;
		//MAX_PASSANGERS_COUNT = 10;
		
		final int SSN;
		SSN = 234234521;
		//SSN++ is not possible.
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max range for roadster "+finalVars.ROADSTER_MAX_RANGE);
		System.out.println("MODEL 3 max speed "+finalVars.MODEL3_MAX_SPEED+"mph");
		System.out.println("Company name "+COMPANY_NAME);
		System.out.println("Admin "+FinalVariables.ADMIN_USERNAME);
	}
}
