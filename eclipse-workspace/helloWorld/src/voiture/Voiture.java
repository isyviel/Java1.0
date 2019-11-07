package voiture;

public class Voiture {

	public static int nombre_voitures = 0;
	public String couleur;
	
	//ecrire un constructeur : 
	//meme si pas écrit java l'écrit automatiquement
	public Voiture(String couleur)
	{
		this.couleur = couleur;
		nombre_voitures++;
		System.out.println("Constructeur avec String");
	}
	
	public Voiture() 
	{
		this("bleu");
		System.out.println("Constructeur vide.");
	}
}
