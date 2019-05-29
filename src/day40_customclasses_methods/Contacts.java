package day40_customclasses_methods;

public class Contacts {
	String name, phoneNumber, email;
	
	public void call() {
		System.out.println("Calling... "+name);
	}
	
	public void sendMessage(){
		System.out.println("Sending message to - "+phoneNumber);
	}
	
	public void sendEmail() {
		System.out.println("Sending Email to "+email);
	}
	
}
