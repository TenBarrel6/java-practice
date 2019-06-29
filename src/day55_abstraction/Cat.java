package day55_abstraction;

public class Cat extends Animal{
	@Override
	public void speak() {
		System.out.println("meow");
	}
	
	public void eat() {
		System.out.println("Eats Zelenka");
	}
}
