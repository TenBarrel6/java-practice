package day45_encapsulation_practice;

import java.util.*;

public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programming");
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtan");
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		List<String> javaStudents = new ArrayList<String>();
		javaStudents.add("Barak Obama");
		javaStudents.add("Sung Hun");
		javaStudents.add("Donald Trump");
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Jacky Chan");
		
		System.out.println(course1.toString());
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		course1.removeStudent("Donald Trump");
		System.out.println(course1.getStudents());
		
	}
}
