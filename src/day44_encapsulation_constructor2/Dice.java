package day44_encapsulation_constructor2;
import java.util.*;
public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("SDET", "Amazon", 130_000.0);
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		// how to create list of jobs
		// and add 5 different jobs with company, salary and title
		
		List<Job> jobList = new ArrayList<Job>();
		jobList.add(job3);
		jobList.add(new Job("Scrum Master", "Google", 123_000.0));
		jobList.add(new Job("President", "USA", 234_000.0));
		jobList.add(new Job("BA", "Leidos", 98000.0));
		
		System.out.println(jobList);
		
		//find the highest paying job and print toString for that
		double maxSalary = 0; int highestIndex = -1;
		for(int i = 0; i<jobList.size(); i++) {
			if(jobList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary = jobList.get(i).getAnnualSalary();
				highestIndex = i;
			}
		}
		
		System.out.println(jobList.get(highestIndex));
	}
}
