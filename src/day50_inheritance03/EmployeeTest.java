package day50_inheritance03;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTime full = new FullTime();
		Contractor cont = new Contractor();
		
		emp.calculatePay(34, 15);
		full.calculatePay(34, 15);
		cont.calculatePay(34, 15);
	}
}
