package day50_inheritance03;

public class Google extends SearchEngine{
	
	@Override
	public int search(String item) {
		System.out.println("Searching for : "+item);
		int resultsCount = item.length();
		return resultsCount;
	}
}
