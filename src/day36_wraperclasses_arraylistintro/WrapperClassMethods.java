package day36_wraperclasses_arraylistintro;

public class WrapperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		int count = Integer.parseInt("345346346");//convert String to primitive
		int count2 = Integer.valueOf("346364364");//create integer Object and doing auto-boxing
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isLetter('a'));
		System.out.println("********");
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isDigit(9));
		System.out.println(Character.isDigit(123));
		System.out.println(Character.isDigit('@'));
		
		String word = "asdgasg346sgjslkjg";
		for(int i = 0; i<word.length(); i++) {
			if(Character.isDigit(word.charAt(i))) {
				System.out.print(word.charAt(i));
			}
		}
	}

}