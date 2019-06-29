package day62_exeptions01;

public class ExceptionInCatch {
	public static void main(String[] args) {
		String str = "10j";
		try {
			int n = Integer.parseInt(str);
		}catch(Exception e) {
			System.out.println(str.charAt(6));
		}finally {
			System.out.println("Finally block");
		}
	}
}
