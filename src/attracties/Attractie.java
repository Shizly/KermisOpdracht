package attracties;

public abstract class Attractie {	
	public String naam;
	public double prijs;
	public int opp;

	public double omzet;
	public int kaartverk;
	
	public Attractie(String naam, double prijs, int opp){
	 	this.naam = naam;
	 	this.prijs= prijs;
	 	this.opp= opp;
	}

	public void draaien(){
		System.out.println("U koos voor " +naam);
		omzet = (omzet+prijs);
		kaartverk = (kaartverk+1);
		System.out.println("De "+naam +" heeft " + omzet + "euro omgezet en "+kaartverk +" kaartjes verkocht.");
}
}
//interface GokAttractie {
//	public void BelastingAfdragen();;
//}