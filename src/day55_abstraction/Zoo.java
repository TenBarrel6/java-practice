package day55_abstraction;

public class Zoo {
	public static void main(String[] args) {
//		Animal animal = new Animal(); Cannot instantiate type Animal 
		Cat fluffy = new Cat();
		fluffy.speak();
		fluffy.eat();
		Dog pisos = new Dog();
		pisos.speak();
		pisos.setName("Pisos");
		pisos.eat();
		System.out.println(pisos.getName());
	}
}
