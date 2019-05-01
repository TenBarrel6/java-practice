package day36_wraperclasses_arraylistintro;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AUTOBOXING -> primitive to object
		
		Integer num1 = 1234;
		int n = 5; 
		Integer num2 = n;
		System.out.println(num2);
		
		//UNBOXING -> object to primitive
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println(d2);
		
		long l1 = new Long(6000000); //unboxing
		Long l2 = new Long(3453623634564L); // no boxing, just creating an object
		long l3 = l2; // unboxing
		Long l4 = l3; // auto-boxing
		
		Integer num3 = Integer.valueOf(1234);
//		Double d3 = num3; casting not possible for objeects
	}

}
