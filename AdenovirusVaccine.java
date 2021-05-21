package it.polito.oop.vaccines;

abstract public class AdenovirusVaccine implements Vaccine{
	private String technology;

	private double efficacy;
	private double cost;
	private int numberOfDoses;
	private int intervalBetweenDoses;
	
	
	public AdenovirusVaccine(String technology, double efficacy, double cost, int numberOfDoses,
			int intervalBetweenDoses) {
		this.technology = technology;
		this.efficacy = efficacy;
		this.cost = cost;
		this.numberOfDoses = numberOfDoses;
		this.intervalBetweenDoses = intervalBetweenDoses;
	}

	public String getTechnology() {
		return technology;
	}

	@Override

	public double getEfficacy() {
		return efficacy;
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public int getNumberOfDoses() {
		return numberOfDoses;
	}

    public int getGetIntervalBetweenDoses() {
		return intervalBetweenDoses;
	}
	
	@Override
	public String toString() {
		return "Adenovirus Vaccine (" + technology + ") " + Vaccine.describe(this);
	}

	
}
