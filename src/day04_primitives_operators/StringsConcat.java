package day04_primitives_operators;

public class StringsConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string variable called firstName and assign your firstname
		String firstName = "Ruslan.";
		System.out.println("My first name: " + firstName);
		
		String bornCity = "Kiev.";
		System.out.println("I was born in " + bornCity);
		
		String job = "SDET";
		String company = "Tesla.";
		System.out.println("I work as " + job + " in " + company);
		
		String zipCode = "22030";
		System.out.println("I live in " + zipCode + " zipcode.");
		
		int num1 = 10;
		int num2 = 30;
		System.out.println(num1+""+num2);
		
		String app = "Slack";
		//We use <Slack> for messaging with Classmates
		
		System.out.println("We use " + app +" for messaging with Classmates.");
		
		app = "Slack" + " and Skype";
		//We use <Slack> for messaging with Classmates
		
		System.out.println("We use " + app +" for messaging with Classmates.");

	}

}
