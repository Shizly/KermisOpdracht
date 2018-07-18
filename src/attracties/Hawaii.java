package attracties;

public class Hawaii extends Attractie{
	String naam = "HawaiiTrip";
	public static double prijs = 2.90;
	int opp = 30;
	static double omzet;
	static int kaartverk;
	
	public static void draaien(){
		System.out.println("De Hawaii draait");
		omzet = (omzet+prijs);
		kaartverk = (kaartverk+1);
		System.out.println("De Hawaii heeft " + omzet + "euro omgezet en "+kaartverk +" kaartjes verkocht.");
	}
}