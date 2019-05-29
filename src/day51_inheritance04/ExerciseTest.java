package day51_inheritance04;

public class ExerciseTest {
	public static void main(String[] args) {
		Exercise ex = new Exercise();
		Running run = new Running();
		Swimming swim = new Swimming();
		Yoga yo = new Yoga();
		JiuJitsu jiu = new JiuJitsu();
		Sprinting ps = new Sprinting();
		
		System.out.println(ex.perform(23)+" calories burned");
		System.out.println(run.perform(33)+" calories burned");
		System.out.println(swim.perform(45)+" calories burned");
		System.out.println(yo.perform(110)+" calories burned");
		System.out.println(jiu.perform(75)+" calories burned");
		System.out.println("******");
		System.out.println(ps.perform(100));
	}
}
