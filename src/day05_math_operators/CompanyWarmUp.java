package day05_math_operators;

public class CompanyWarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "Facebook";
		String address = "Silicon Valley, CA";
		int numberOfEmployees = 10234;
		long revenue = 5000234123L;
		boolean isTechCompany = true;

		System.out.println("Company name is "+companyName);
		System.out.println("Address is "+address);
		System.out.println("Number of employees is "+numberOfEmployees);
		System.out.println("Annual revenue is "+revenue);
		System.out.println("Is it a tech company? - "+isTechCompany);

		    
		//System.out.println(revenue + isTechCompany); => will not work
		    
		String aboutCompany = "Company "+companyName+" is located in "+address+numberOfEmployees+" enployees work for Mark Zukenberg.";

		//=> \n its for having your code in new line.

		System.out.println(aboutCompany); 
		

	}

}
