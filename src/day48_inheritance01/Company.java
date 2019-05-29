package day48_inheritance01;

public class Company {
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.name = "Trump";
		emp1.jobTitle = "President";
		emp1.gender = 'm';
		emp1.age = 52;
		
		emp1.work();
		emp1.eat("shawerma");
		emp1.walk();
		emp1.sleep(8);
		
	}
}
