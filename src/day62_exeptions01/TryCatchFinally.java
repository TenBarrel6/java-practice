package day62_exeptions01;

public class TryCatchFinally {
	public static void main(String[] args) {
		String str = "selenium";
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(34));
		}catch(Exception e) {
			System.out.println("Enter correct index");
			System.exit(0);
		}finally {
			System.out.println("Finally block");
		}
	}
}
