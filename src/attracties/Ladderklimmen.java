package attracties;

import totaalpakket.Kassa;

public class Ladderklimmen extends Attractie implements GokAttractie{
	public Ladderklimmen(String naam, double prijs, int opp){
		super(naam, prijs, opp);
	}

	public double omzetb;

	public void BelastingAfdragen() {
		double belastingres = (omzetb * 0.3);
		String afgerondebelasting = String.format("%.2f", belastingres); 
		System.out.println(afgerondebelasting +" euro van de omzet van " +naam + " naar de belasting.");
		Kassa.TOmzet = (Kassa.TOmzet - belastingres);
		omzet = (omzet - belastingres);
		omzetb = 0;
	}
}