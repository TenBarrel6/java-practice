package day57_interfaces;

public class Dog implements Pet, Callable{

	@Override
	public void respond() {
		// TODO Auto-generated method stub
		System.out.println("Dog is responding woof-woof");
	}

	@Override
	public void keepAsPet() {
		// TODO Auto-generated method stub
		System.out.println("Dog is keeping in Da house");
	}
	
}
