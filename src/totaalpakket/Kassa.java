package totaalpakket;
import java.util.Scanner;

import attracties.*;

public class Kassa{
	static double TOmzet = 0.00;
	static int TKaartjes = 0;
	
	Botsautos botsauto = new Botsautos("Botsauto's",2.50,80);
	Hawaii hawaii = new Hawaii("Hawaii",2.90,30);
	Ladderklimmen ladderklimmen = new Ladderklimmen ("Ladderklimmen",5.00,5);
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis ("Spiegelpaleis",2.45,40);
	Spin spin = new Spin ("Spin",2.25,25);
	Spookhuis spookhuis = new Spookhuis ("Spookhuis",3.20,60);

	public void betaalbotsautos() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+botsauto.prijs);
		System.out.println(TKaartjes +" " +TOmzet);	
	}
	public void betaalhawaii() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+hawaii.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public void betaalladderklimmen() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+ladderklimmen.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public void betaalspiegelpaleis() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+spiegelpaleis.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public void betaalspin() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+spin.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public void betaalspookhuis() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+spookhuis.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public void adminstratie() {
		Scanner scAdmin = new Scanner(System.in);
		boolean doorgaan = true;
		while (doorgaan){
			System.out.println("Druk op o om de omzet te zien.\nDruk op k om de kaartverkoop te zien\nDruk op q om te stoppen.");
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
		}
	}
}
