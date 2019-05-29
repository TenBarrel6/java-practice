package day50_inheritance03;

public class SlackChannel {
	public static void main(String[] args) {
		SlackUser user = new SlackUser("Nadir");
		AdminUser admin = new AdminUser("Florian");
		
		user.sendAMessage("Lets summarize Sunday class");
		admin.sendAMessage("Sure");
	}
}
