package attracties;
import totaalpakket.Kassa;

public class Spin extends Attractie implements RisicoRijkeAttracties, GokAttractie{ //implementeert zowel RisicoRijkeAttracties als GokAttractie
	public Spin(String naam, double prijs, int opp){  //Constructor zoals vereist volgens de superclass Attractie
		super(naam, prijs, opp);
	}						//begin implementeren interface RisicoRijkeAttracties
	public int draailimiet = 5;		//voor deze attractie is draailimiet 5
	public int rondjesSindsKeur;     //aantal rondjes sinds keuring.
	public boolean magdraaien = true;   //startwaarde van de boolean magdraaien = true

	public void opstellingsKeuring() {
		if (rondjesSindsKeur >= draailimiet) {  //controlleert het aantal rondjes sinds laatste keuring. Als deze hoger/gelijk dan draailimiet is...
			magdraaien = false;				//.. wordt magdraaien false gemaakt
		}
	}						//eind implementeren interface RisicoRijkeAttracties
							// begin implementeren de interface GokAttractie
	public double omzetb;		// dit is de omzet waar nog belasting over geheven moet worden (omzetb=omzet belastbaar).

	public void BelastingAfdragen() {
		double belastingres = (omzetb * 0.3);			//belastingres is hoeveel naar belasting moet. Uitgerekent adhv omzetb
		String afgerondebelasting = String.format("%.2f", belastingres); 	//rond de uitkomst af op 2 decimalen en slaat dit op in een string
		System.out.println(afgerondebelasting +" euro van de omzet van " +naam + " naar de belasting.");   // print uit welk bedrag naar de belasting gaat
		Kassa.TOmzet = (Kassa.TOmzet - belastingres);	//TOmzet wordt verminderd met wat naar belasting is gegaan
		omzet = (omzet - belastingres);					//omzet van deze attractie wordt verminderd met wat naar belasting is gegaan
		omzetb = 0;										//de omzet waar nog belasting over geheven moet worden wordt gereset naar 0.
	}						// einde implementeren van de interface GokAttractie
}
