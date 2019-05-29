package day44_encapsulation_constructor2;

public class WhatsAppMessages {
	public static void main(String[] args) {
		WhatsApp wapp = new WhatsApp("703-333-4321", "Good for you!");
		WhatsApp wapp1 = new WhatsApp("703-345-1234");
		System.out.println(wapp1.getMessage());
	}
}
