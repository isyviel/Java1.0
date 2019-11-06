package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");	
		String mess = concat(5,"Bonjour");
		System.out.println(mess);
		System.out.println(concat(8,"Au revoir"));

		System.out.println("************");
		System.out.println(mesBonbons(12,32));
		System.out.println("************");
		
		System.out.println(methodOne(6,'c'));
		System.out.println("************");
		
		methodTwo(9);
		System.out.println("************");
		
	}

	public static String concat(int n, String s) {
		return n + s;
	}
	
	public static int mesBonbons(int panier, int chasse) {
		return panier + chasse;
	}
	
	/* Méthode :
     *     - prend un entier n et un caractère c
     *     - retourne une chaîne de caractères : répétition de n fois le caractère c
     */
	public static String methodOne(int n,char c)
	{
		String s = "";
		for(int i = 1; i <= n; i++)
		{
			s += c;
		}
		return s;
	}
		
    /*
     * Méthode :
     *     - prend deux entiers n et m, un caractère c
     *     - affiche sur la console un rectangle de n lignes, m colonnes, avec le caractère c
     */
	public static void methodTwo(int m)
	{
		String s = "";
		for(int j=1;j<m;j++)
		{
			System.out.println(methodOne(8,'c'));
		}
	}
	
}

