package totaalpakket;
import java.util.Scanner;
import attracties.*;

public class Entree {
	public void spelen() {
		Botsautos botsautos = new Botsautos();
		
		System.out.println("Welkom op de Kermis! We hebben 6 attracties.\n1 = Botsauto's 2 = Spin\n3 = Spiegelpaleis 4 = Spookhuis\n5 = Hawaii 6 = Ladderklimmen");
		
		Boolean doorgaan = true;
		while (doorgaan) {
			System.out.println("Welk nummer heeft de attractie waar u heen wilt?");
			Scanner scInp = new Scanner(System.in); 
			int scSpelen = scInp.nextInt();

			switch (scSpelen) {
				case 1: botsautos.draaien();
						Kassa.betaalbotsautos();
					break;
				case 2: Spin.draaien();
						Kassa.betaalspin();
					break;
				case 3: Spiegelpaleis.draaien();
						Kassa.betaalspiegelpaleis();
					break;
				case 4: Spookhuis.draaien();
						Kassa.betaalspookhuis();
					break;
				case 5: Hawaii.draaien();
						Kassa.betaalhawaii();
					break;
				case 6: Ladderklimmen.draaien();
						Kassa.betaalladderklimmen();
			}
			System.out.println("Wilt u nogmaals? Zeg 'nee' om te stoppen en 'ja' om door te gaan.");
			Scanner scStop = new Scanner(System.in);
			String scDoorgaan = scStop.nextLine();
			if(scDoorgaan.equals("nee")) {
				doorgaan = false;
				System.out.println("Danku voor uw komst en tot ziens!");
			}	
		}
		
	}
}
