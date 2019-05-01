package day33_methods05;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addVoid(4, 6);
		System.out.println(add(1, 6));
		System.out.println(multiplication(4, 19));
	}
	
	public static void addVoid(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int multiplication(int num1, int num2) {
		return num1*num2;
	}

}
