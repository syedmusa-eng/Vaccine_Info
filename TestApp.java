import it.polito.oop.vaccines.*;


public class TestApp {

	public static void main(String[] args) {
		Vaccine v1 = new AstraZeneca();     //v1 is an object of class AstraZeneca that implements interface(vaccine)
		Vaccine v2 = new Pfizer();           //v2 is an object of class Pfizer that implements interface(vaccine)

		System.out.println(v1 +  "  Total cost: " + v1.totalCost());
		System.out.println(v2 +  "  Total cost: " + v2.totalCost());

		
		Vaccine.describe(v1);
	}

}
