package voiture;

public class Voiture {

	public static int nombre_voitures = 0;
	public String couleur;
	
	//ecrire un constructeur : 
	//meme si pas �crit java l'�crit automatiquement
	public Voiture(String couleur)
	{
		this.couleur = couleur;
		nombre_voitures++;
		System.out.println("je suis dans le constructeur de voiture");
	}
}