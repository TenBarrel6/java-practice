package day34_methods06;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(8, 3);
	}
	
	public static void add(String num1, String num2) {
		String str3 = num1+num2;
		System.out.println(str3);
	}
	
	public static void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println(result);
	}
	
	
	
	public static void add(double num1, double num2) {
		System.out.println(num1+num2);
	}

}
