
public class MyPets {
	
	public static void main(String[] args) {
		
		Pet pet1 = new Pet("Dog", "Poohchi");
		Pet pet2 = new Pet("Cat", "Barsik");
		Pet pet3 = new Pet("Cat", "Mila");
		Pet pet4 = new Pet("Fish", "Purple");
		Pet pet5 = new Pet("Goat", "Kozlik");
		Pet pet6 = new Pet("Bird", "Mina | Chika");
		
		pet1.speak();
		System.out.println(pet1.toString());
		pet2.speak();
		System.out.println(pet2.toString());
		pet3.speak();
		System.out.println(pet3.toString());
		pet6.speak();
		System.out.println(pet6.toString());
	}
}
