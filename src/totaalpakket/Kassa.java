package totaalpakket;
import java.util.Scanner;

import attracties.*;

public class Kassa{
	public static double TOmzet = 0.00;
	static int TKaartjes = 0;
	
	BelastingInspecteur belastinginspecteur = new BelastingInspecteur();
	
	public void betaal(Attractie attracties) {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+attracties.prijs);
		System.out.println("Totale kaartjes: "+TKaartjes +" totale omzet: " +TOmzet);	
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
				BelastingInspecteur.Betalen(Kermisopdracht.ladderklimmen);
				BelastingInspecteur.Betalen(Kermisopdracht.spin);
			}			
		}
	}
}
