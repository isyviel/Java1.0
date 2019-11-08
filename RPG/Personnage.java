package RPG;

public class Personnage {

	private String nom;
	private String race;
	private String classe;
	private int vie;
	private int mana;
	private int endurance;
	private int force;
	private int agilite;
	private int intelligence;
	
	public Personnage(String nom)
	{
		this.nom = nom;
	}
	public Personnage(String race, String nom)
	{
		this.nom = nom;
		this.race = race;
	}
	
	public String enterTavern() 
	{
		return nom + " franchit la porte de la taverne.";
	}
	
	public int loseLife(int dommages)
	{
		this.vie -= dommages;
		return this.vie;
	}
	
	public String stillAlive()
	{
		if (vie <= 0)
		{
			return nom + " est mort.";
		}else
		{
			return nom + " est encore en vie";
		}
	}
	
	public String seCognerLorteil(int dommages, String objet)
	{
		return nom +
				" se cogne le petit orteil dans un "+ objet +" et se fait "
				+ dommages + " points de dégats." + 
				" Il lui reste " + loseLife(dommages) +
				" points de vie. " + stillAlive();
	}
	
	/*public int doDamages()
	{
		
	}*/
}

