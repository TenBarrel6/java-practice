package day49_inheritance02_abstraction_polymorphism;

public class AudioBook extends Book{
	private double length;
	private String narrator;
	
	public AudioBook() {
		length = 0.0;
		narrator = "undefined";
	}
	
	public AudioBook(double length, String narrator) {
		this.length = length;
		this.narrator = narrator;
	}
	
	public void listen() {
		System.out.println("Listening to "+getTitle()+" by "
	+getAuthor()+" and narrated by "+narrator);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getNarrator() {
		return narrator;
	}

	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
	
	
	
}
