package attracties;

public class Ladderklimmen extends Attractie implements GokAttractie{
	public Ladderklimmen(String naam, double prijs, int opp){
		super(naam, prijs, opp);
	}
	public double belastingres;
	
//double omzetb = omzet;

	public void BelastingAfdragen() {
		double belastingres = (omzet * 0.3);
		System.out.println(belastingres +" euro naar de belasting");
		omzet = 0;
	}
}