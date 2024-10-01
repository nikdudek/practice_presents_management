package practice_presents_management;

public abstract class Cookie extends Sweet {
	
	public Cookie(String name, double weight, double sugarWeight) {
		super(name, weight, sugarWeight);
		// TODO Auto-generated constructor stub
	}

	private double doughWeight;

	public double getDoughWeight() {
		return doughWeight;
	}

	public void setDoughWeight(double doughWeight) {
		this.doughWeight = doughWeight;
	}
}
