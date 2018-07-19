package totaalpakket;
import java.util.Scanner;

import attracties.*;

public class Kassa {
	static double TOmzet = 0.00;
	static int TKaartjes = 0;
	
	public static void betaalbotsautos() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+attracties.Botsautos.prijs);
		System.out.println(TKaartjes +" " +TOmzet);	
	}
	public static void betaalhawaii() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+attracties.Hawaii.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public static void betaalladderklimmen() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+attracties.Ladderklimmen.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public static void betaalspiegelpaleis() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+attracties.Spiegelpaleis.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public static void betaalspin() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+attracties.Spin.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public static void betaalspookhuis() {
		TKaartjes = (TKaartjes+1);
		TOmzet = (TOmzet+attracties.Spin.prijs);
		System.out.println(TKaartjes +" " +TOmzet);
	}
	public static void adminstratie() {
		Scanner scAdmin = new Scanner(System.in);
		boolean doorgaan = true;
		while (doorgaan){
			System.out.println("Druk op o om de omzet te zien.\nDruk op k om de kaartverkoop te zien\n Druk op q om te stoppen.");
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
