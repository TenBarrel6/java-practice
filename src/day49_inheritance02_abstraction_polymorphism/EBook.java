package day49_inheritance02_abstraction_polymorphism;

public class EBook extends Book{
	private double size;
	private int pages;
	
	public EBook() {
		size = 0.0;
		pages = 0;
	}
	
	public EBook(double size, int pages) {
		this.size = size;
		this.pages = pages;
	}
	
	public void readEBook(int page) {
		System.out.println("Reading "+getTitle()+" by "+getAuthor()+" at page "+page);
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
}
