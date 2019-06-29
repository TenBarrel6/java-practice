package day52_inheritance05;

public class EqualsMethod {
	String name;
	int age;
	
	public void EqualsMethod() {
		EqualsMethod("asdf", 24);
	}
	
	public void EqualsMethod(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	public static void main(String[] args) {
//		Computer comp1 = new Computer("iMac", "silver");
//		Computer comp2 = new Computer("iMac", "silver");
//		Computer comp3 = comp2;// point to same object
//		
//		System.out.println(comp1 == comp2);
//		System.out.println(comp1.equals(comp2));
//		
//		System.out.println(comp3 == comp2);
//		System.out.println(comp3.equals(comp2));
//	}
}
