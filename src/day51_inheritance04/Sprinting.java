package day51_inheritance04;

public class Sprinting extends Running{
	public int perform(int minutes) {
		int cal = super.perform(10);//call super class version of perform
		System.out.println("Sprinting for "+minutes+" minutes");
		return minutes*7+cal;
	}
}
