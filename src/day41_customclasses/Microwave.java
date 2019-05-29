package day41_customclasses;

public class Microwave {
	String brand; boolean isOn;
	
	public void turnOn() {
		if(isOn) { System.out.println("It is already on"); }
		System.out.println("Turning on the microwave"); 
		isOn = true;
	}
	
	public void turnOf() {
		if(isOn) { System.out.println("Turning off the microwave"); isOn = false;}
		System.out.println("It is already off");
	}
	
	public void heat() {
		
	}

}
