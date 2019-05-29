package day50_inheritance03;

public class AnimalTest {
	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.moving(45);
		cat.moving(45);
		dog.moving(45);
		duck.moving(45);
	}
}
