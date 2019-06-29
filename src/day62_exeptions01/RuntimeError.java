package day62_exeptions01;

public class RuntimeError {
	static int i = 0;
	public static void main(String[] args) {
		go();
	}
	
	public static void go() {
		System.out.println(i+"going");
		i++;
		go(); // method calls itself - recursive method.
	}

}
