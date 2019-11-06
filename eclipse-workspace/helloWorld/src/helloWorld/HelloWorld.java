package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		//definir le type de la variable en meme temps que ca valeur
		//forcer le type avec un cast mais doit rester logiquement faisable
		
		int variable = (int) 3.7;
		float variable2 = 3;
		double variable3 = 4.8;
		
		//ln dit va a la ligne
		System.out.println(variable);
		System.out.println("**********");
		System.out.println(variable2);
		System.out.println("**********");
		System.out.println(variable3);
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("**********");
		int i = 3;
		while(i>0) {
			System.out.println(i);
			i--;
		//d'abord je fais le corps de la boucle
			// a la,fin de chaque tour de boucle je vais tester la condition
		} do {
			System.out.println(i);
			i++;
		} while(i < 5);
		
		int tableau[] = {0,1,2,3,4,5,6,7,8};
		int somme = 0;
		String avengers[] = {"Iron Man","Captain America","Loki","Docteur Strange","Hulk"};
		
		System.out.println("Tableau des multiplications");
		System.out.println("**********");
		
		for (int j = 0; j < tableau.length-1; j++)
		{
			int oldValue = tableau[j];
			int multi = tableau[j+1] * oldValue;
			System.out.println(multi);
		}

		System.out.println("Tableau des sommes");
		System.out.println("**********");
		
		for (int j : tableau)
		{
			somme += j;
			System.out.println(somme);
		}
		System.out.println("**********");
		System.out.println(somme);
		System.out.println("**********");
		for (int k = 0; k < avengers.length; k++)
		{
			if (avengers[k] == "Hulk")
			{
				System.out.println(avengers[k]);
			}
		}
	}
	
}
