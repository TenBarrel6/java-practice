package day_54_InheritanceReview;

public class Block_Practices {
	public static String names;
	
	static {
		names = "John";
	}
	
	{
		names = "Aaron";
	}
	
	public Block_Practices() {
		names = "Murodil";
	}
	
	int num1 = 10;
	static int num2 = 10;
	
	public static void main(String[] args) {
		System.out.println(names);
		
		Block_Practices obj = new Block_Practices();
		
		obj.num1 = 20;
		obj.num2 = 20;
		
		Block_Practices obj2 = new Block_Practices();
		
		System.out.println(obj2.num1);// 10
		System.out.println(obj2.num2);// 20
	}
}
