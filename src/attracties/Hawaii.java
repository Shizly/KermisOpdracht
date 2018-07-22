package attracties;

public class Hawaii extends Attractie implements RisicoRijkeAttracties{
	public Hawaii(String naam, double prijs, int opp){
		super(naam, prijs, opp);
	}
	public int draailimiet = 10;
	public int rondjesSindsKeur;
	public boolean magdraaien = true;

	public void opstellingsKeuring() {
		if (rondjesSindsKeur >= draailimiet) { 
			magdraaien = false;	
		}
	}	
}