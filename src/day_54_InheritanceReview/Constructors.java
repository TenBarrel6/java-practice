package day_54_InheritanceReview;

class Example1 {
	public Example1(int n) {
		System.out.println("Constructor 1");
	}
	
	public Example1(double n) {
		this(3);
	}
	
}

class Example2 {
	
}

public class Constructors {
	public static void main(String[] args) {
		new Example1(9);
	}
}

/*
					constructor - belongs to the object.
					
					1. Every class MUST have constructor.
					(if there isnt any declared, compiler gonna give u default one.)
					
					2. Cannot have specifier and return type.
						Specifiers: final, static, abstract
						return types: void, premitives, wrapper class, all objects
					
					3. Constractors name must mutch class name.
					
					4. Constructors execution depends on the creation of object.
					(Same with instance block, after instance block)
				 
					 5. constructor can only be called in other constructor. 
					 				( methods or blocks cannot call constructor)
					 
					 6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
					 				this(): calls the class' constructor
					 				super(): calls the super class' constructor
					 				
					 7. constructor cannot call or contain itself
					 
					 8. A constructor cannot call more than one constructor
					 
					 9. constructor' body constructor call needs to be at first step
					 
					 10. class' object MUST be created with existing and visible constructor(s)
					 
					 11. super class' no-arg constructor is called in sub class' constructorS by default
					 
					 12. super class' constructor ( if there isn't deafult constructor) MUST be called in sub class
					  		(if there is more than one constructor in super class, only one of them needs to be calld)
*/