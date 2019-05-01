package day07_scanner_operators;

public class comparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(5==5); //true
		System.out.println(50==5); //false
		int searchCount = 5000;
		System.out.println(searchCount==5000);//true
		
		int expectedCount = 5010;
		System.out.println(searchCount==expectedCount);//false
		
		int speedLimit = 55;
		int currentSpeed = 75;
		System.out.println(currentSpeed==speedLimit);
		
		boolean atLimit = currentSpeed==speedLimit;
		
		System.out.println("at limit: "+atLimit);
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("over speed: "+overLimit);
		
		boolean underLimit = currentSpeed < speedLimit;
		System.out.println("under speed: "+underLimit);
		System.out.println("\n");

		
		double balance = 150.0;
		boolean broke = balance <= 0.0;
		System.out.println("Broke? "+broke);
		
		double transaction = 155.5;
		broke = (balance - transaction)<0;
		System.out.println("Will make broke/negative? - "+broke);
		
		System.out.println("Balance: "+balance);
		System.out.println("Transaction: "+transaction);
		
		
	

	}

}
