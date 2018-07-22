package totaalpakket;

import attracties.GokAttractie;

public class BelastingInspecteur {
	public static void Betalen(GokAttractie overdragen1) {
		overdragen1.BelastingAfdragen();  //overdragen1 is het object dat meegestuurd wordt. Dat object gaat BelastingAfdragen uitvoeren.
	}
}
// via deze methode wordt weer andere methode aangeroepen, wat overbodige tussenstap lijkt. Alleen was de class "BelastingInspecteur" een vereist
// en dit voor nu m'n manier om deze class te gebruiken.
