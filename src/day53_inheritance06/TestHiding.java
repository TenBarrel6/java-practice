package day53_inheritance06;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(345,  "London");
		Capital cap = new Capital(433, "Paris", 53232435L);
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
		//call static methods which are hiden
		
		city.buildARoad();
		cap.buildARoad();
		
		//or
		
		City.buildARoad();
		Capital.buildARoad();
		
		City city2 = new City(142, "Zashikiv");
		Capital cap2 = new Capital(142, "Kyiv", 4_000_000L);
		
		city2.letsBuildARoad();
		cap2.letsBuildARoad();
	}
}
