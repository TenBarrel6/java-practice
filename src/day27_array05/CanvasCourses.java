package day27_array05;

import java.util.Scanner;

public class CanvasCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your URL:");
		String url = scan.nextLine();
		
		String[] course = url.split("/");
		int id = Integer.parseInt(course[course.length-1]);
		switch(id) {
		case 147: 
			System.out.println("Java programming");
			break;
		case 204: 
			System.out.println("Mentoring sessions");
			break;
		case 149: 
			System.out.println("SDLC");
			break;
		case 152: 
			System.out.println("QA Testing");
			break;
		case 144: 
			System.out.println("Team activity");
			break;
		case 143: 
			System.out.println("Welcome Kit");
			break;
		default: System.out.println("No existing Id!");
		break;
		}
		
		
	}

}
