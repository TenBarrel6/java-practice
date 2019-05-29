package day46_static;

public class Vehicle {
	String type; // instance variable, every object has its own type
	static int numbOfVehicles; // shared, one central value
	
	public static void vehicleInfo() {
//		System.out.println("Vehicle type: "+type);		<== not gonna work, cause var type is non-static var;
		System.out.println("Number of vehicles available: "+getNumbOfVehicles());
	}

	public static int getNumbOfVehicles() {
		return numbOfVehicles;
	}
	
	
	
	
}
