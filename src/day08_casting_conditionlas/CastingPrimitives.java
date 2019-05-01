package day08_casting_conditionlas;

public class CastingPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cast double value to int
		int i = (int)3.4;
		System.out.println("i: "+i);
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println("Price: $"+dollars);
		
		//WHOLE NUMBER. byte, short, int
		
		int count = 2344;
		byte byteCount = (byte)count;
		System.out.println("Count: "+byteCount);
		
		long longValue = 2342342434L;
		int intValue = (int)longValue;
		System.out.println("intValue: "+intValue);
		
		int large = 5678;
		short small =(short)large;
		System.out.println("Value of small: "+small);
		     //250<-//250 <-//250.2
		int result = (int)(500.4/2.0);
		System.out.println("Result: "+result);
		

	}

}
