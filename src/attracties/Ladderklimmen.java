package attracties;

public class Ladderklimmen extends Attractie{
	String naam = "LadderOp";
	public static double prijs = 5.00;
	int opp = 5;
	static double omzet;
	static int kaartverk;
	
	public static void draaien(){
		System.out.println("Het laderklimmen is bezig");
		omzet = (omzet+prijs);
		kaartverk = (kaartverk+1);
		System.out.println("Het ladderklimmen heeft " + omzet + "euro omgezet en "+kaartverk +" kaartjes verkocht.");
	}
}