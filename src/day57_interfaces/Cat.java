package day57_interfaces;

public class Cat implements Pet, Callable{

	@Override
	public void respond() {
		// TODO Auto-generated method stub
		System.out.println("Cat is responding meow meow");
	}

	@Override
	public void keepAsPet() {
		// TODO Auto-generated method stub
		System.out.println("Cat in da house");
	}

}
