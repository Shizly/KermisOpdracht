package totaalpakket;

import attracties.GokAttractie;

public class BelastingInspecteur {
	public static void Betalen(GokAttractie overdragen1) {
		System.out.println("Pas op! De Belastinginspecteur komt langs!");
		overdragen1.BelastingAfdragen();
	}
}
