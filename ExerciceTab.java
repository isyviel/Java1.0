package tableaux;

public class ExerciceTab {

	//Attributs
	int[] tab;
	int length;
	
	//Methodes
	
	//Constructeur
	
	public ExerciceTab() 
	{
		tab = new int[10];
		length = 0;
	}
	
	public void display() 
	{
		System.out.print('[');
		for (int i=0; i< length; i++)
		{
			System.out.print(tab[i]);
			System.out.print(',');
		}
		System.out.println(']');
	}
	
	/*
	 * add(int)
	 */
	public void add(int n)
	{
		tab[length] = n;
		length++;
	}
	
	/*
	 * add(int,int)
	 */
	public void add(int index, int element) {
		for(int i = 0; i < length-index; i++)
		{
			tab[length-i] = tab[length-(i+1)];
		}
		tab[index] = element;
		length++;
	}
	
	/*
	 * clear()
	 */
	public void clear()
	{
		length = 0;
	}
	
	/*
	 * size()
	 */
	
	public int size()
	{
		return length;
	}
	
	/*
	 * toString()
	 */
	
	
	
	/*
	 * contains()
	 */
	
	/*public boolean contains(int numb)
	{
		for(int i=0; i < length;i++)
		{
			if (tab[i] == numb)
			{
				return true;
			}else {
				return false;
			}
		}
	}*/
	
	
	
	/*
	 * contains(int)
	 * get(in)
	 * remove(int)
	 * set(int,int)
	 * size()
	 */
	
	
	
}
