package totaalpakket;
import java.util.Scanner;
import attracties.*;

public class Entree {

	public void spelen() {
        
		Kassa kassa = new Kassa();
		System.out.println("Welkom op de Kermis! We hebben 6 attracties.\n1 = Botsauto's 2 = Spin\n3 = Spiegelpaleis 4 = Spookhuis"
				+ "\n5 = Hawaii 6 = Ladderklimmen"
				+"\nOm te stoppen typt u 9.");
		
		Boolean doorgaan = true;
		while (doorgaan) {
			System.out.println("Welk nummer heeft de attractie waar u heen wilt?");
			Scanner scInp = new Scanner(System.in); 
			int scSpelen = scInp.nextInt();

			switch (scSpelen) {
				case 1: Kermisopdracht.botsautos.draaien();
						kassa.betaal(Kermisopdracht.botsautos);
					break;
				case 2: if (Kermisopdracht.spin.magdraaien == true) {
							Kermisopdracht.spin.draaien();
							kassa.betaal(Kermisopdracht.spin);
							Kermisopdracht.spin.omzetb = (Kermisopdracht.spin.omzetb + Kermisopdracht.spin.prijs);
							Kermisopdracht.spin.opstellingsKeuring();
						}
					break;
				case 3: Kermisopdracht.spiegelpaleis.draaien();
						kassa.betaal(Kermisopdracht.spiegelpaleis);
					break;
				case 4: Kermisopdracht.spookhuis.draaien();
						kassa.betaal(Kermisopdracht.spookhuis);
					break;
				case 5: Kermisopdracht.hawaii.draaien();
						kassa.betaal(Kermisopdracht.hawaii);
					break;
				case 6: Kermisopdracht.ladderklimmen.draaien();
						kassa.betaal(Kermisopdracht.ladderklimmen);
						Kermisopdracht.ladderklimmen.omzetb = (Kermisopdracht.ladderklimmen.omzetb + Kermisopdracht.ladderklimmen.prijs);
					break;
				case 9: doorgaan = false;
						System.out.println("Danku voor uw komst en tot ziens!");
					break;
				default: System.out.println("Dat was geen optie");
			}	
		}
	}
}
