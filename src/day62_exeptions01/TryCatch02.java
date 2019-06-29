package day62_exeptions01;

public class TryCatch02 {
	public static void main(String[] args) {
		int j = 100;
		
		try {
			int n = j/0;
			System.out.println(n);
		}catch(ArithmeticException e){
			System.out.println("Fuck you");
			e.printStackTrace();
		}
		
		System.out.println("After try/catch");
	}
}
