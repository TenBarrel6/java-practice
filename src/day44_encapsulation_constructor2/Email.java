package day44_encapsulation_constructor2;

public class Email {
	String message;
	public Email(String message) {
		System.out.println("Sending E-mail with message: "+message);
		this.message = message;
	}
}
