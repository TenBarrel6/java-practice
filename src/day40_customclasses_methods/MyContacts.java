package day40_customclasses_methods;

public class MyContacts {
	public static void main(String[] args) {
		//create Contact object
		Contacts con1 = new Contacts();
		con1.name = "Elvis Presley";
		con1.phoneNumber = "(202)-333-4444";
		con1.email = "ElvisIsAlive@fbi.com";
		
		con1.call();
		con1.sendMessage();
		con1.sendEmail();
		
		Contacts orhan = new Contacts();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571)-991-4564";
		orhan.email = "orhan@whitehouse.gov";
		
		System.out.println("Name: "+orhan.name);
		System.out.println("Email: "+orhan.email);
		
		int n = 2; String str = "aasgd", s = ""; 
		s += str.charAt(n);
		
		str = str.replace(s, "");
		System.out.println(str);
		
	}
}
