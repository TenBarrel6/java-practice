package day62_exeptions01;

public class NullPointer {
	static String name; // null
	public static void main(String[] args) {
		try {
			System.out.println(name.toUpperCase());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException happend");
			System.out.println("Here is the message: "+e.getMessage());
			System.out.println("Here is the StackTrace: ");
			e.printStackTrace();
		}
		
	}
}
