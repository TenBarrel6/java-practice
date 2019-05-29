package day49_inheritance02_abstraction_polymorphism;

public class ZooFary {
	public static void main(String[] args) {
		Leopard leo = new Leopard();
		System.out.println(leo.getType());
		System.out.println("*************************");
		Leopard bar = new Leopard("Barsik");
		System.out.println(bar.getType());
	}
}
