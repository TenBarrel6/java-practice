package day57_interfaces;

public interface Electric {
	public static final boolean HAS_BATTERIES = true;
	public static final int MAX_BATTERIES = 100_000;
	
	public abstract void charge();
}
