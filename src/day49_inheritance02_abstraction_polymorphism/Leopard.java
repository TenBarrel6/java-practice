package day49_inheritance02_abstraction_polymorphism;

public class Leopard extends Animal{
	
	public Leopard() {
		super(); //call parent class no-ars constructor
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type); //call Animal 1-arg constructor
		System.out.println("Leopard 1-arg constructor");
	}
}
