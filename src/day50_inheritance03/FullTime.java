package day50_inheritance03;

public class FullTime extends Employee{
	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("FullTime employee total pay: "
	+((hours*rate)*1.05)+"$");
	}
}
