package day52_inheritance05;

public class FinalMethod {
	public final void method1() {
		System.out.println("final method 1");
	}
	
}

class SubFinal extends FinalMethod {
	//cannot override since it is a final method.
//	public final void method1() {
//		System.out.println("final method 1");
//	}
	
	public void method1(String str) {
		System.out.println("Method 1"+str);
	}
}
