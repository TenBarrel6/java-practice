package day49_inheritance02_abstraction_polymorphism;

public class PaperBack extends Book{
	private int pages;
	
	@Override
	public String toString() {
		return "PaperBack : " + getTitle() + " | "+ getAuthor() + " | " + getPrice()
		+"$ | "+getType()+" | "+pages+" pages";
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
