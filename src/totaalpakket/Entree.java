package totaalpakket;
import java.util.Scanner;

public class Entree {

	public void spelen() throws DraailimietFout { // gooit exception omhoog naar Kermisopdracht
        
		Kassa kassa = new Kassa();
		System.out.println("Welkom op de Kermis! We hebben 6 attracties.\n1 = Botsauto's      2 = Spin\n3 = Spiegelpaleis   4 = Spookhuis"
				+ "\n5 = Hawaii          6 = Ladderklimmen"
				+"\nOm te stoppen typt u 9.");
		
		Boolean doorgaan = true;  //innitieert while-loop
		while (doorgaan) {
			System.out.println("Welk nummer heeft de attractie waar u heen wilt?");
			Scanner scInp = new Scanner(System.in); 
			int scSpelen = scInp.nextInt();
// GokAttractie en RisicoRijkeAttractie is allebei in Spin geimplementeerd. Class-inrichting en bijhorende methodes zijn gecommenent in de Class Spin	
			switch (scSpelen) {			//user selecteert welke attractie hij wilt uitvoeren
				case 1: Kermisopdracht.botsautos.draaien();		//methode 'draaien' van object botsautos zoals gemaakt in class Kermisopdracht wordt uitgevoerd
						kassa.betaal(Kermisopdracht.botsautos); //metode 'betaal' van object kassa wordt uitgevoerd, object botsautos wordt meegegeven
					break;
				case 2: if (Kermisopdracht.spin.magdraaien == false) {		//spin is risicovolle attractie. Wordt gekeken of deze aan het draailimiet is		
							throw new DraailimietFout();		//als aan draailimiet, gooi exception omhoog
						}else {
							Kermisopdracht.spin.draaien();
							Kermisopdracht.spin.rondjesSindsKeur = (Kermisopdracht.spin.rondjesSindsKeur+1); //+1 int RondjesSindsKeuring
							Kermisopdracht.spin.opstellingsKeuring(); //voert controle uit of spin.magdraaien op 'false' gezet moet worden
							
							kassa.betaal(Kermisopdracht.spin);
							Kermisopdracht.spin.omzetb = (Kermisopdracht.spin.omzetb + Kermisopdracht.spin.prijs); //Spin is gokattractie. Zie class Spin voor meer info.	
						}
					break;
				case 3: Kermisopdracht.spiegelpaleis.draaien();
						kassa.betaal(Kermisopdracht.spiegelpaleis);
					break;
				case 4: Kermisopdracht.spookhuis.draaien();
						kassa.betaal(Kermisopdracht.spookhuis);
					break;
				case 5: if (Kermisopdracht.hawaii.magdraaien == false) {
							throw new DraailimietFout();
						}else {
							Kermisopdracht.hawaii.draaien();
							Kermisopdracht.hawaii.rondjesSindsKeur = (Kermisopdracht.hawaii.rondjesSindsKeur+1);
							Kermisopdracht.hawaii.opstellingsKeuring();

							kassa.betaal(Kermisopdracht.hawaii);
						}
					break;
				case 6: Kermisopdracht.ladderklimmen.draaien();
						kassa.betaal(Kermisopdracht.ladderklimmen);
						Kermisopdracht.ladderklimmen.omzetb = (Kermisopdracht.ladderklimmen.omzetb + Kermisopdracht.ladderklimmen.prijs);
					break;
				case 9: doorgaan = false;
						System.out.println("Danku voor uw komst en tot ziens!"); //optie 9 beëindigd de while-loop
					break;
				default: System.out.println("Dat was geen optie"); //als user een int geeft die geen optie is, print dit
			}
		}
	}
}

class DraailimietFout extends Exception{}
