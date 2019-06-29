package day62_exeptions01;

public class TryCatch {
	public static void main(String[] args) {
		try {
			String str = "java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));
			System.out.println(str.charAt(2));
		}catch(Exception e) {
			System.out.println("Exception in try block");
		}
		
		System.out.println("After try catch block");
	}
}
