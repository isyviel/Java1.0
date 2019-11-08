package RPG;

public class Taverne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personnage wizardo = new Personnage("Wizardo");
		System.out.println(wizardo.enterTavern());
		System.out.println(wizardo.seCognerLorteil(5,"tabouret"));
		
		Personnage archier = new Personnage("Archier");
		System.out.println(archier.enterTavern());
		
		Personnage barbeer = new Personnage("Barbeer", "nain");
		
	}
	
	

}
