package day41_customclasses;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car toyota = new Car();
		toyota.make = "Toyota";
		toyota.model = "Prius";
		toyota.color = "Black";
		toyota.currentSpeed = 67;
		
		toyota.printCarInfo();
		toyota.showCurrentSpeed(55);
		
		Car ford = new Car();
		ford.make = "Ford";
		ford.model = "Mustang";
		
		ford.drive();
		toyota.drive();
		ford.printCarInfo();
		ford.accellerate(45);
		toyota.accellerate(5);
		ford.printCarInfo();
		toyota.showCurrentSpeed(65);
		
		BMW bmw = new BMW();
		bmw.model = "330i";
		bmw.showPrice();
	}

}
