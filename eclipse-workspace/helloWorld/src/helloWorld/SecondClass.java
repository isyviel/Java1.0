package helloWorld;

public class SecondClass {
	
	private static void triangle(int n, char c) {
		
		String s = ""+c;
		for(int i = 0; i < n ;i++)
		{
			System.out.println(s);
			s+=c;
		}

	}
	
	public static void triangle_public(char c)
	{
		triangle(10,c);
	}

}
