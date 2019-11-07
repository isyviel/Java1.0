package voiture;

public class Voiture {

	private static int nombre_voitures = 0;
	private String couleur;
	private static int nbrRoues = 4;
	private int rouesDispo;
	
	//ecrire un constructeur : 
	//meme si pas écrit java l'écrit automatiquement
	public Voiture(String couleur)
	{
		this.couleur = couleur;
		nombre_voitures++;
		System.out.println("Constructeur avec String");
	}
	
	public String getCouleur()
	{
		return couleur;
	}
	
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}
	
	public static int getNombre()
	{
		return Voiture.nombre_voitures;
	}
	
	public static int getRoue()
	{
		return nbrRoues;
	}
	
	public int getRdispo()
	{
		return rouesDispo;
	}
	
	public void setRdispo(int rouesDispo)
	{
		this.rouesDispo = rouesDispo;
	}
	
	public int perdreRoue(int nbrRperdues)
	{
		rouesDispo -= nbrRperdues;
		return rouesDispo;
	}
	
	public Voiture()
	{
		this("bleu");
	}
}

