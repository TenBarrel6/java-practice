package day08_casting_conditionlas;

public class implicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//automatic castimg from smaller to large type
		
		short shortValue = 3455;
		int intValue = (int)shortValue; // optional (int), no need
		System.out.println("intValue: "+intValue);
		
		double price = 345;
		System.out.println("Price: "+price);
		
		int price1 = 34563;
		double dPrice = price1;
		System.out.println("dP: "+dPrice);
		
		
		
		

	}

}
