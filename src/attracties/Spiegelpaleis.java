package attracties;

public class Spiegelpaleis extends Attractie{
	String naam = "LachJeRot";
	public static double prijs = 2.75;
	int opp = 40;
	static double omzet;
	static int kaartverk;
	
	public static void draaien(){
		System.out.println("Het Spiegelpaleis draait");
		omzet = (omzet+prijs);
		kaartverk = (kaartverk+1);
		System.out.println("Het spiegelpaleis heeft " + omzet + "euro omgezet en "+kaartverk +" kaartjes verkocht.");
	}
}