package day_54_InheritanceReview;

class Animals{
	public Animals() {
		System.out.println("Tiger");
	}
}

public class ConstructorSuper1 extends Animals{
	
	public ConstructorSuper1() {
		super(); // it's not visible BUT compiler putting by default in every constructor
	}
	
	public ConstructorSuper1(int a) {
		// the super() is present here, BUT not visible
	}
	
	public ConstructorSuper1(double a) {
		// same here
	}
	
	public static void main(String[] args) {
		new ConstructorSuper1(10.34);
	}
}
