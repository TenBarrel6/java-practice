package day48_inheritance01;

public class School {
	public static void main(String[] args) {
		Person per1 = new Person();
		Student stud1 = new Student();
		
		per1.name = "Obama";
		per1.age = 57;
		per1.gender = 'm';
		
		stud1.name = "Roman";
		stud1.age = 25;
		stud1.gender = 'm';
		
		per1.eat("steak");
		stud1.eat("grechka");
		
		per1.walk();
		stud1.walk();
		
		per1.sleep(8);
		stud1.sleep(2);
		
		Student stud2 = new Student();
		stud2.name = "Orhan";
		stud2.age = 40;
		stud2.gender = 'm';
		stud2.studentId = 2322;
		stud2.clazz = "Agile Scrum";
		stud2.code("java");
		stud2.attendClass();
		stud2.eat("kebab");
		stud2.walk();
		
		stud1.code("python");
	}
}
