package day49_inheritance02_access_test;

import day49_inheritance02_abstraction_polymorphism.Device;
// IPad IS-A Device. IPad is a subclass in a different package
public class IPad extends Device{  // <---- Even if you extend Class from different package you 
	//have to import it.
	
	public void readEbook(String title) {
		System.out.println("Reading a book "+title+" using "+brand);//PUBLIC
		System.out.println("model "+model);//PROTECTED
//		System.out.println("price: "+price); not visible DEFAULT
//		System.out.println("Made in "+country); <-- not visible PRIVATE
	}

}
