package day56_abstraction02;

public class Alcatel extends MobilePhone{
	public void call() {
		System.out.println("Alcatel calling....");
	}
	public void orderBitches() {
		System.out.println("Alcatel: Ordering Bitches...");
	}
	public void text(String text) {
		System.out.println("Alcatel texting: "+text);
	}
}
