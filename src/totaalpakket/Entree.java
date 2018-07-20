package totaalpakket;
import java.util.Scanner;
import attracties.*;

public class Entree {
	public void spelen() {
		Attractie[] attracties;
		Botsautos botsautos = new Botsautos("Botsauto's",2.50,80);
		Hawaii hawaii = new Hawaii("Hawaii",2.90,30);
		Ladderklimmen ladderklimmen = new Ladderklimmen ("Ladderklimmen",5.00,5);
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis ("Spiegelpaleis",2.45,40);
		Spin spin = new Spin ("Spin",2.25,25);
		Spookhuis spookhuis = new Spookhuis ("Spookhuis",3.20,60);
		
		attracties = new Attractie[6];
        attracties[0] = botsautos;
        attracties[1] = spin;
        attracties[2] = spiegelpaleis;
        attracties[3] = spookhuis;
        attracties[4] = hawaii;
        attracties[5] = ladderklimmen;
        
		Kassa kassa = new Kassa();
		System.out.println("Welkom op de Kermis! We hebben 6 attracties.\n1 = Botsauto's 2 = Spin\n3 = Spiegelpaleis 4 = Spookhuis\n5 = Hawaii 6 = Ladderklimmen");
		
		Boolean doorgaan = true;
		while (doorgaan) {
			System.out.println("Welk nummer heeft de attractie waar u heen wilt?");
			Scanner scInp = new Scanner(System.in); 
			int scSpelen = scInp.nextInt();

			switch (scSpelen) {
				case 1: botsautos.draaien();
						kassa.betaalbotsautos();
					break;
				case 2: spin.draaien();
						kassa.betaalspin();
					break;
				case 3: spiegelpaleis.draaien();
						kassa.betaalspiegelpaleis();
					break;
				case 4: spookhuis.draaien();
						kassa.betaalspookhuis();
					break;
				case 5: hawaii.draaien();
						kassa.betaalhawaii();
					break;
				case 6: ladderklimmen.draaien();
						kassa.betaalladderklimmen();
					break;
				default: System.out.println("Dat was geen optie");
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
