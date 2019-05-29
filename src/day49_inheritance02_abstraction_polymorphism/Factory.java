package day49_inheritance02_abstraction_polymorphism;
	//Factory -> non-sub Class that is in same package
public class Factory {
	public static void main(String[] args) {
		Device d1 = new Device();
		d1.brand = "LG";//PUBLIC
		d1.model = "cpi3225";// PROTECTED
		d1.price = 2500; // DEFAULT
//		d1.country = "Korea"; <-- not visible PRIVATE
		
	}
}
