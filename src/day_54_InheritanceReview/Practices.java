package day_54_InheritanceReview;

public class Practices {
	int b =5;
	
	@Override
	public String toString() {
		return "Practices [b=" + b + "]";
	}

	public Practices(int i, double d, boolean b) {
		System.out.println("Number is: "+i);
		System.out.println("GPA is: "+d);
		System.out.println("Passed: "+b);
	}
	
	public static void main(String[] args) {
		Practices obj = new Practices(1, 3.6, false);
		System.out.println("\n**********************\n");
		Child obj2 = new Child(2, 89.3, true);
	}
}

class Child extends Practices{
	public Child(int i, double d, boolean b) {
		super(i, d, b);
	}
}
