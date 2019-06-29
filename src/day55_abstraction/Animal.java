package day55_abstraction;

public abstract class Animal {
	
	private String name;

	public abstract void speak();// we cannot have abstract methods in a regular classes
	
	public abstract void eat();
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
}
