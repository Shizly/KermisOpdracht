package totaalpakket;
import attracties.*;

import java.util.Scanner;

public class Kermisopdracht {
	static Botsautos botsautos = new Botsautos("Botsauto's",2.50,80);			// alle attacties worden hier gemaakt met naam, prijs en opp.
	static Hawaii hawaii = new Hawaii("Hawaii",2.90,30);
	static Ladderklimmen ladderklimmen = new Ladderklimmen ("Ladderklimmen",5.00,5);
	static Spiegelpaleis spiegelpaleis = new Spiegelpaleis ("Spiegelpaleis",2.45,40);
	static Spin spin = new Spin ("Spin",2.25,25);
	static Spookhuis spookhuis = new Spookhuis ("Spookhuis",3.20,60);
	
	public static void main (String[] args) {
		
		Entree entree = new Entree();
		Kassa kassa = new Kassa();

		boolean doorgaan = true;			//innitieert while-loop
		while (doorgaan) {
			System.out.println("Druk op k om naar de kermis te gaan, a voor de adminstratie, m voor een monteur, of q om te stoppen");
			Scanner scInp = new Scanner(System.in); 
			String scKeuze = scInp.nextLine();
			if (scKeuze.equals("k")) { //Dit probeert de user naar de methode 'spelen' in het object entree in de class Entree te sturen. Zie daar voor mee info
				try {
					entree.spelen();
				} catch (DraailimietFout e) {  //vangt de exception op als een attractie een exception stuurt vanwege het draailimiet
					System.out.println("Stop! Dit is gevaarlijk! Het draailimiet is bereikt.\nWe sturen je terug naar de entree. Vraag of er een monteur langs kan komen.");
				} catch (Exception f) { //vangt exception op als user een char/string geeft ipv int
					System.out.println("Probeer je de Kermis te slopen?! Ga maar weer naar buiten!");
				}
				
			}
			if (scKeuze.equals("a")) {  //dit roept de methode 'adminstratie' aan in het object kassa van de class Kassa. Zie daar voor verdere uitleg.
				kassa.adminstratie();
			}
			if (scKeuze.equals("m")) {			// Dit is zogenaamd de monteur. Als 'magdraaien' bij een RisicoAttractie false is, gaat hij dit resetten naar true
				System.out.println("Problemen? Ik ga kijken voor je......");
				if (spin.magdraaien == false) {   //als Spin niet mag draaien, dit uitgevoerd
					spin.magdraaien = true;			// dat spin mag draaien wordt weer op true gezet
					spin.rondjesSindsKeur = 0;		// aantal rondjes sinds keuring wordt op 0 gezet
					System.out.println("De Spin is geïnspecteerd en zou het weer moeten doen.");
				}
				if (hawaii.magdraaien == false) {  //als Hawaii niet mag draaien, dit uitgevoerd
					hawaii.magdraaien = true;
					hawaii.rondjesSindsKeur = 0;		// aantal rondjes sinds keuring wordt op 0 gezet
					System.out.println("De Hawaii is geïnspecteerd en zou het weer moeten doen.");
				}else {
					System.out.println("Er is voor nu mij niks te doen. Roep me maar als een attractie problemen heeft.");
				} //bug: Als De Spin geinspecteerd wordt, wordt de Else ook uitgeprint. Maar als de Hawaii geinspecteerd wordt, wordt de Else niet uigeprint.
			}
			if (scKeuze.equals("q")) {  //dit beëindigd de while-loop
				doorgaan = false;
			}
		}
	}
}
