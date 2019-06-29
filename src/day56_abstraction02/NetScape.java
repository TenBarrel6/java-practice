package day56_abstraction02;

public class NetScape extends Browser{
	
	public NetScape() {
		super();
		System.out.println("NetScape Constructor");
	}
	
	public void navigate(String url) {
		System.out.println("NetScape - navigating to: "+url);
	}
	
	public void displayWebpage() {
		System.out.println("Displaying WebPage");
	}
	
	public boolean launch() {
		System.out.println("NetScape is launched");
		return true;
	}
	
	public void close() {
		System.out.println("Exitting NetScape");
	}
}
