package attracties;

import totaalpakket.Kassa;

public class Spin extends Attractie implements RisicoRijkeAttracties, GokAttractie{
	public Spin(String naam, double prijs, int opp){
		super(naam, prijs, opp);
	}	
	public int draailimiet = 5;
	public boolean magdraaien = true;

	public void opstellingsKeuring() {
		if (kaartverk == draailimiet) {
			magdraaien = false;
		}
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
