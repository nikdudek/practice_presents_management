package practice_presents_management;

import java.util.Arrays;

public class Present {
	
	private static final int DEFAULT_SWEETS_CAPACITY = 10;
	private Sweet[] sweets;
	private int lastIndexAdded;
	
	{
		sweets = new Sweet[DEFAULT_SWEETS_CAPACITY];
		lastIndexAdded = 0;
	}
	
	// the method filters sweets by sugar weight inclusively
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		int filteredSweetsCounter = 0;
		for(Sweet sweet : sweets) {
			if(sweet != null && (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight))
				filteredSweetsCounter++;
		}
		
		Sweet[] copyOfSweets = new Sweet[filteredSweetsCounter];
		int index = 0;
		for(Sweet sweet : sweets) {
			if(sweet != null && (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight))
				copyOfSweets[index++] = sweet;
		}
		return copyOfSweets;
	}
	
	// the method calculates total weight of the present
	public double calculateTotalWeight() {
		double totalWeight = 0.0;
		for(Sweet sweet : sweets)
			if(sweet != null)
				totalWeight += sweet.getWeight();
		
		return totalWeight;
	}	

	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
		if(sweet == null)
			return;
		if(lastIndexAdded + 1 >= sweets.length)
			sweets = Arrays.copyOf(sweets, sweets.length * 2);
		sweets[lastIndexAdded++] = sweet;
	}



	// the method returns copy of the Sweet[] array so that nobody could
	// modify state of the present without addSweet() method.
	// Also array shouldn’t contain null values.

	public Sweet[] getSweets() {
		int nullCount = 0;
		for(Sweet sweet : sweets)
			if(sweet == null)
				nullCount++;
		Sweet[] copyOfSweets = Arrays.copyOf(sweets, sweets.length - nullCount);
		return copyOfSweets;
	}
}
