package attracties;

import totaalpakket.Kassa;

public class Ladderklimmen extends Attractie implements GokAttractie{
	public Ladderklimmen(String naam, double prijs, int opp){
		super(naam, prijs, opp);
	}

	public double omzetb;

	public void BelastingAfdragen() {
		double belastingres = (omzetb * 0.3);
		System.out.println(belastingres +" euro naar de belasting");
		Kassa.TOmzet = (Kassa.TOmzet - belastingres);
		omzet = (omzet - belastingres);
		omzetb = 0;
	}
}