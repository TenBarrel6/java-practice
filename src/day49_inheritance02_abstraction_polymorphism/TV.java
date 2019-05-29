package day49_inheritance02_abstraction_polymorphism;
// TV is the sub class in the same package 
public class TV extends Device{
	public void watch() {
		System.out.println("Watching TV - "+brand+" model "+model);//PUBLIC, PROTECTED
		System.out.println("The price is - "+price); //DEFAULT
//		System.out.println("Made in "+country); <---- not visible PRIVATE
	}
}
