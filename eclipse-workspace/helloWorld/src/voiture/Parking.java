package voiture;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//le type de v1 est la classe voiture
		System.out.println(Voiture.nombre_voitures);
		Voiture batmobil = new Voiture("rouge");
		System.out.println(Voiture.nombre_voitures);
		Voiture impala = new Voiture("rose");
		System.out.println(Voiture.nombre_voitures);
		
		System.out.println(batmobil.couleur);
		batmobil.couleur = "noire";
		impala.couleur= "chrome";
		System.out.println(batmobil.couleur);
		System.out.println(impala.couleur);
		
		Voiture.nombre_voitures = 3;
		System.out.println(Voiture.nombre_voitures);	
		}

}
