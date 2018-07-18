package attracties;

public class Botsautos extends Attractie{
	String naam = "Botsbotsbots!";
	public static double prijs = 2.75;
	int opp = 60;
	static double omzet;
	static int kaartverk;
	
	public static void draaien(){
		System.out.println("De Botsauto's rijden");
		omzet = (omzet+prijs);
		kaartverk = (kaartverk+1);
		System.out.println("De botsauto's hebben " + omzet + "euro omgezet en "+kaartverk +" kaartjes verkocht.");
		
	}
}
