package attracties;

public abstract class Attractie {	
	public String naam;	
	public double prijs;
	public int opp;

	public double omzet;
	public int kaartverk;
	
	public Attractie(String naam, double prijs, int opp){		//constructor met 3 verplichte primitives
	 	this.naam = naam;
	 	this.prijs= prijs;
	 	this.opp= opp;
	}
	public void draaien(){						//elke sub-class kan deze methode uitvoeren.
		System.out.println("U koos voor " +naam);	//welke attractie gekozen werd
		omzet = (omzet+prijs);						// verhoogt de omzet met de prijs van de attractie
		kaartverk = (kaartverk+1);					// verhoogt het aantal verkochte kaartjes met 1
		String afgerondeOmzet = String.format("%.2f", omzet);   //rond de double af op 2 decimalen
		System.out.println("De "+naam +" heeft " + afgerondeOmzet + " euro omgezet en "+kaartverk +" kaartjes verkocht.");
	}
}
