package practice_presents_management;

public class Present {
	
	private static final int DEFAULT_SWEETS_CAPACITY = 10;
	private Sweet[] sweets;
	private int lastIndexAdded;
	
	{
		sweets = new Sweet[DEFAULT_SWEETS_CAPACITY];
	}
	
	// the method filters sweets by sugar weight inclusively
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		//<write your code here>
		}
	
	// the method calculates total weight of the present
	public double calculateTotalWeight() {
	//<write your code here>
	}	

	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
	//<write your code here>
	}



	// the method returns copy of the Sweet[] array so that nobody could
	// modify state of the present without addSweet() method.
	// Also array shouldn’t contain null values.

	public Sweet[] getSweets() {
		//to_do
	}
}
