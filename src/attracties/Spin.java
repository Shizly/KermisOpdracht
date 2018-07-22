package attracties;
import totaalpakket.Kassa;

public class Spin extends Attractie implements RisicoRijkeAttracties, GokAttractie{ //implementeert zowel RisicoRijkeAttracties als GokAttractie
	public Spin(String naam, double prijs, int opp){  //Constructor zoals vereist volgens de superclass Attractie
		super(naam, prijs, opp);
	}							//regel 9 t/m 17 implementeren interface RisicoRijkeAttracties
	public int draailimiet = 5;		//voor deze attractie is draailimiet 5
	public int rondjesSindsKeur;     //aantal rondjes sinds keuring.
	public boolean magdraaien = true;   //startwaarde van de boolean magdraaien = true

	public void opstellingsKeuring() {
		if (rondjesSindsKeur >= draailimiet) {  //controlleert het aantal rondjes sinds laatste keuring. Als deze hoger/gelijk dan draailimiet is...
			magdraaien = false;				//.. wordt magdraaien false gemaakt
		}
	}	
								// regel 19 t/m  28 implementeren de interface GokAttractie
	public double omzetb;		// dit is de omzet waar nog belasting over geheven moet worden (omzetb=omzet belastbaar).

	public void BelastingAfdragen() {
		double belastingres = (omzetb * 0.3);			//belastingres is hoeveel naar belasting moet. Uitgerekent adhb omzetb
		System.out.println(belastingres +" euro van de omzet van " +naam + " naar de belasting.");   // print uit wel bedrag naar de belasting gaat
		Kassa.TOmzet = (Kassa.TOmzet - belastingres);	//TOmzet wordt verminderd met wat naar belasting is gegaan
		omzet = (omzet - belastingres);					//omzet van deze attractie wordt vermind met wat naar belasting is gegaan
		omzetb = 0;										//de omzet waar nog belasting over geheven moet worden wordt gereset naar 0.
	}
}
