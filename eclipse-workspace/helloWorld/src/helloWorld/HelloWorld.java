package helloWorld;

public class HelloWorld {

	public static int x = 42;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");	
		String mess = concat(5,"Bonjour");
		System.out.println(mess);
		System.out.println(concat(8,"Au revoir"));

		System.out.println("************");
		System.out.println(mesBonbons(12,32));
		System.out.println("************");
		
		System.out.println(methodOne(6,'o'));
		System.out.println("************");
		
		methodTwo(3,9,'O');
		System.out.println("************");
		SecondClass.triangle_public('n');
		
	}

	public static String concat(int n, String s) {
		return n + s;
	}
	
	public static int mesBonbons(int panier, int chasse) {
		return panier + chasse;
	}
	
	/* M�thode :
     *     - prend un entier n et un caract�re c
     *     - retourne une cha�ne de caract�res : r�p�tition de n fois le caract�re c
     */
	public static String methodOne(int n,char c)
	{
		String s = "";
		for(int i = 1; i <= n; i++)
		{
			s += c;
		}
		//on va chercher l'argument de la seconde classe
		System.out.println(SecondClass.test);
		return s;
	}
		
    /*
     * M�thode :
     *     - prend deux entiers n et m, un caract�re c
     *     - affiche sur la console un rectangle de n lignes, m colonnes, avec le caract�re c
     */
	public static void methodTwo(int n,int m,char c)
	{
		//permet d'�viter de r�p�ter le calcul 5 fois, le faire une fois et r�p�ter l'affichage 5 fois
		String s = methodOne(m,c);
		for(int j=1;j<=n;j++)
		{
			System.out.println(s);
		}
	}
	
}

