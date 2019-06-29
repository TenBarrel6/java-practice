package day60_polymorphism02;

public class Ipad extends AppleDevice{
	public double maxScreenSize = 12.9;
	public void use() {
		System.out.println("IPad | Read book | Watch series");
	}
	
	public void draw() {
		System.out.println("Drawing shapes");
	}
}
