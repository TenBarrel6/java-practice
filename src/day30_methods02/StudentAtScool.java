package day30_methods02;

public class StudentAtScool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study("HOW TO SMOKE");
		study("SQL");
		sleep(8);
	}
	
	public static void study(String topic) {
		System.out.println("Student is studying "+topic);
	}
	
	static void sleep(int hours) {
		System.out.println("Student should sleep "+hours);
	}

}
