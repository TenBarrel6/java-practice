package day56_abstraction02;

public class Chrome extends Browser{
	public Chrome() {
		super();
		System.out.println("Chrome Constructor");
	}
	
	public void navigate(String url) {
		System.out.println("Chrome - navigating to: "+url);
	}
	
	public void displayWebpage() {
		System.out.println("Displaying WebPage");
	}
	
	public boolean launch() {
		System.out.println("Chrome is launched");
		return true;
	}
	
	public void close() {
		System.out.println("Exitting Chrome");
	}
}
