package it.polito.oop.vaccines;

//Interface class with abstract content in it.
public interface Vaccine {
	double getEfficacy();
	double getCost();
	int getNumberOfDoses();
	int getIntervalBetweenDoses();
	
	//method of an interface.
	//Can only have static/default methods.
	default double totalCost() {
		return getCost() * getNumberOfDoses();
	}
	
	static String describe(Vaccine v) {
		return "  cost: " + v.getCost() + " * " + v.getNumberOfDoses() + "; efficacy: " + v.getEfficacy();
	}
}
