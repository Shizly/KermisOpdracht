package attracties;

public class Spin extends Attractie implements RisicoRijkeAttracties{
	public Spin(String naam, double prijs, int opp){
		super(naam, prijs, opp);
	}	
	public int draailimiet = 5;
	public boolean magdraaien = true;

	public void opstellingsKeuring() {
		if (kaartverk >= draailimiet) {
			magdraaien = false;
		}
	}
}

//RisicoRijkeAttracties moeten een keuring ondergaan nadat ze opgesteld zijn. 
//Deze methode heet dus opstellingsKeuring() en die returnt een boolean. 
//
//RisicoRijkeAttracties hebben een draaiLimiet. Dit is het aantal maal dat ze mogen draaien 
//voordat er een onderhoudsbeurt moet plaatsvinden. Voor de Spin is dit 5 en voor de Hawaii is dit 10.