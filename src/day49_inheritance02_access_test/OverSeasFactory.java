package day49_inheritance02_access_test;

import day49_inheritance02_abstraction_polymorphism.Device;

// Non-sub class in different package
public class OverSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device(); // <--- If you wanna use class from another package, 
		//you have to import it.
		
		dv.brand = "Samsung";// PUBLIC
//		dv.model = "3200";  <---- not visible PROTECTED
//		dv.price = 2500; <----- not visible DEFAULT
//		dv.country = "El Salvador"; <----- not visible PRIVATE
	}
}
