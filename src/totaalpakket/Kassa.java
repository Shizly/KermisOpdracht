package totaalpakket;
import java.util.Scanner;

import attracties.*;

public class Kassa{
	public static double TOmzet = 0.00;
	static int TKaartjes = 0;
	
	BelastingInspecteur belastinginspecteur = new BelastingInspecteur();
	
	public void betaal(Attractie attracties) {		// deze methode wordt door een attractie uitgevoerd. Word opgeroepen in class "Entree"
		TKaartjes = (TKaartjes+1);					//deze regel verhoogt het aantal kaartjes met 1
		TOmzet = (TOmzet+attracties.prijs);			//deze regel verhoogt de TOmzet met de prijs van de attractie die deze methode uitvoert
	}

	public void adminstratie() {
		Scanner scAdmin = new Scanner(System.in);
		boolean doorgaan = true;
		while (doorgaan){
			System.out.println("Druk op o om de omzet te zien.\nDruk op k om de kaartverkoop te zien\nDruk op b om de belasting af te dragen."
					+ "\nDruk op q om te stoppen.");
			String KassaInzicht = scAdmin.nextLine();
			if (KassaInzicht.equals("o")) {
				System.out.println("De totale omzet is " + Kassa.TOmzet);
			}
			if (KassaInzicht.equals("k")) {
				System.out.println("Het totaal aantal kaartjes verkocht is " + Kassa.TKaartjes);
			}
			if (KassaInzicht.equals("q")) {
				doorgaan = false;
			}
			if (KassaInzicht.equals("b")) {
				System.out.println("Pas op! Het is de belastinginspecteur!");
				BelastingInspecteur.Betalen(Kermisopdracht.ladderklimmen); 
				BelastingInspecteur.Betalen(Kermisopdracht.spin); //Belastinginspecteur gaat methode Betalen uitvoeren en het object spin wordt meegestuurd
			}			
		}
	}
}
