package totaalpakket;
import attracties.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Kermisopdracht {
	static Botsautos botsautos = new Botsautos("Botsauto's",2.50,80);
	static Hawaii hawaii = new Hawaii("Hawaii",2.90,30);
	static Ladderklimmen ladderklimmen = new Ladderklimmen ("Ladderklimmen",5.00,5);
	static Spiegelpaleis spiegelpaleis = new Spiegelpaleis ("Spiegelpaleis",2.45,40);
	static Spin spin = new Spin ("Spin",2.25,25);
	static Spookhuis spookhuis = new Spookhuis ("Spookhuis",3.20,60);
	
	public static void main (String[] args) {
		
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
		//Ladderklimmen bewijs dat de interface werkt
//	Ladderklimmen laddertest = new Ladderklimmen("Ladder2", 3.5, 5);
//	laddertest.omzet = 15;
//	laddertest.BelastingAfdragen();
		//Bewijs dat de spin een draalimiet heeft
//		Spin spintest = new Spin("spintestje",3.5,5);
//		System.out.println("Het draailimiet is "+spintest.draailimiet);
//		System.out.println("Spintest mag draaien: "+spintest.magdraaien);
//		spintest.kaartverk = 30;
//		spintest.opstellingsKeuring();
//		System.out.println("Spintest mag draaien: "+spintest.magdraaien);
		
		
	}
}