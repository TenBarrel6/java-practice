package day50_inheritance03;

public class Dog extends Animal{
	public void speak() {
		System.out.println("Dog is saying woof woof");
	}
	
	public void moving(int steps) {
		System.out.println("Dog is moving "+steps+" steps.");
	}
}
