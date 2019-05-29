package day41_customclasses;

public class Car {
	String make, model, color; int currentSpeed;

	public void printCarInfo() {
		System.out.println("Car make: "+make+", model: "+model+", color: "+color+", current speed: "+currentSpeed);
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed<=speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+"mph, current speed limit is "+speedLimit+"!");
		}else {
			System.out.println(make+" is driving at "+currentSpeed+"mph, over speed limit!");
		}
	}
	
	public void drive() {
		System.out.println(make+" "+model+" is driving!");
	}
	
	public void accellerate(int mph) {
		currentSpeed+=mph;
	}

}
