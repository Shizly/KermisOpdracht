package attracties;

public class Spookhuis extends Attractie{
	String naam = "BoeHuis";
	public static double prijs = 3.20;
	int opp = 60;
	static double omzet;
	static int kaartverk;

	public static void draaien(){
		System.out.println("Het Spookhuis is bezig");
		omzet = (omzet+prijs);
		kaartverk = (kaartverk+1);
		System.out.println("Het spookhuis heeft " + omzet + "euro omgezet en "+kaartverk +" kaartjes verkocht.");
	}
}
