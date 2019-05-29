package day49_inheritance02_abstraction_polymorphism;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook ebook = new EBook(44.3, 345);
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPrice(170.34);
		ebook.setType("Tech Book");
		System.out.println(ebook.toString());
		System.out.println(ebook.getSize());
		System.out.println(ebook.getPages());
		ebook.readEBook(34);
		
		AudioBook audio = new AudioBook(123.34, "Marufjon");
		audio.setTitle("OCA preparation");
		audio.setAuthor("Jeanne");
		audio.listen();
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(345);
		System.out.println(pb.toString());
	}

}
