package day51_inheritance04;

public class Swimming extends Exercise{
	public int perform(int minutes) {
		System.out.println("Doing Swimming exercise");
		return 11*minutes;
	}
}
