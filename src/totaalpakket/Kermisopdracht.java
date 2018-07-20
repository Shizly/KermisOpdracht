package totaalpakket;
import attracties.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Kermisopdracht {
	public static void main (String[] args) {
		ArrayList<Attractie> attracties = new ArrayList();
//		attracties.add(new Attractie("Botsauto's", 1.25, 12));
		System.out.println("Dit is ons assortiment " +attracties);
		
		Entree entree = new Entree();
		Kassa kassa = new Kassa();

		boolean doorgaan = true;
		while (doorgaan) {
			System.out.println("Druk op k om naar de kermis te gaan, a voor de adminstratie of q om te stoppen");
			Scanner scInp = new Scanner(System.in); 
			String scKeuze = scInp.nextLine();
			if (scKeuze.equals("k")) {
				entree.spelen();
			}
			if (scKeuze.equals("a")) {
				kassa.adminstratie();
			}
			if (scKeuze.equals("q")) {
				doorgaan = false;
			}
		}	
		
//	Ladderklimmen.BelastingAfdragen();
		
	}
}