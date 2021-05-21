package it.polito.oop.vaccines;

//A child class to an abstract class has the access to the abstract methods of an interface.
public class AstraZeneca extends AdenovirusVaccine{
	
	public AstraZeneca() {
		super("ChAdOx1", 0.81, 1.78, 2, 84);
	}

	
	@Override
	public int getIntervalBetweenDoses() {
		return 0;
	}

}
