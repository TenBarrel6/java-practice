package day57_interfaces;

public class Tesla implements Electric, Autonomus{
	public void charge() {
		System.out.println("Tesla is charging at charging station.");
	}
	
	public void selfDriving() {
		System.out.println("Tesla is in auto pilot mode. Driving autonomously.");
	}
}
