package day59_polymorphism;

public class AnimalShow {
	public static void main(String[] args) {
		Animal animal = new Animal();
		//Polymorphic way: reference Animal, object Tiger, Cheetah, Zeebra
		
		Animal tiger = new Tiger();
		Animal cheetah = new Cheetah();
		Animal zebra = new Zebra();
		
//		animal.talk();
//		tiger.talk();
//		cheetah.talk();
//		zebra.talk();
		
		Animal[] animals = new  Animal[4];
		animals[0] = new Tiger();
		animals[1] = new Cheetah();
		animals[2] = new Zebra();
		animals[3] = new Animal();
		for(Animal a:animals) {
			a.talk();
		}
	}
}
