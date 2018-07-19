package totaalpakket;
import attracties.*;
import java.util.Scanner;

public class Kermisopdracht {
	public static void main (String[] args) {
		boolean doorgaan = true;
		while (doorgaan) {
			System.out.println("Druk op k om naar de kermis te gaan, a voor de adminstratie of q om te stoppen");
			Scanner scInp = new Scanner(System.in); 
			String scKeuze = scInp.nextLine();
			if (scKeuze.equals("k")) {
				Entree.spelen();
			}
			if (scKeuze.equals("a")) {
				Kassa.adminstratie();
			}
			if (scKeuze.equals("q")) {
				doorgaan = false;
			}
		}
		Ladderklimmen.BelastingAfdragen();
		
	}
}