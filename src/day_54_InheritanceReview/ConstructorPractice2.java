package day_54_InheritanceReview;

class Lion {
	public Lion() {
		System.out.println("Lion Default");
	}
	public Lion(int a) {
		System.out.println("Lion");
	}
}

public class ConstructorPractice2 extends Lion{
	ConstructorPractice2() {
		super();
	}
}
