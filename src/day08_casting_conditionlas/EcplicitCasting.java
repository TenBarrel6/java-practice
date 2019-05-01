package day08_casting_conditionlas;

public class EcplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/2.0); //result is double
		System.out.println(10.0/2); // same thing
		
		int result = (int)(10/2.0);
		System.out.println("Result: "+result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1+rent2+rent3+rent4)/4D;
		System.out.println("Average rent price: "+average);
		
		
		
		
		

	}

}
