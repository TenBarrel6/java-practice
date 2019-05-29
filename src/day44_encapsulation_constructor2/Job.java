package day44_encapsulation_constructor2;

public class Job {
	public String title, company; 
	public double annualSalary;
	
	public Job(){
		System.out.println("No-args constructor");
		this.title = "undefined";
		this.company = "undefined";
	}
	
	public Job(String title) {
		System.out.println("One-arg constructor");
		this.title = title;
		this.company = "undefined";
	}
	
	@Override
	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}

	public Job(String title, String company, double annualSalary) {
		System.out.println("Three-args constructor");
		setTitle(title);
		this.company = company;
		this.annualSalary = annualSalary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
}
