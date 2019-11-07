package voiture;

public class Voiture {

	public static int nombre_voitures = 0;
	public String couleur;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//le type de v1 est la classe voiture
		Voiture batmobil = new Voiture();
		Voiture impala = new Voiture();
		
		batmobil.couleur = "noire";
		impala.couleur = "chrome";
		
		System.out.println(batmobil.couleur);
		
		Voiture.nombre_voitures = 3;
		
		System.out.println(Voiture.nombre_voitures);	
		}
}
