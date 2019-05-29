package day49_inheritance02_abstraction_polymorphism;

public class Book {
	private String title, type, author;
	private double price;
	
	public Book() {
		title = "undefined book";
		type = "undefined type";
		author = "undefined author";
		price = 0.0;
	}
	
	public Book(String title, String type, String author, double price) {
		this.title = title;
		this.type = type;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", author=" + author + ", price=" + price + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
