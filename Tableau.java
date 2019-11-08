package tableaux;

import java.util.ArrayList;

public class Tableau {
    
    public static void main(String[] args) {
        int [] tab  = {3,14,15};
        String[] tab2 = new String [5];
        tab2[0] = "Bonjour";
        
        System.out.println(tab2[0]);
        
        System.out.println(tab);
        System.out.println(tab[1]);
        
        ArrayList<String> array = new ArrayList<String>();
        array.add("Bonjour");
        System.out.println(array);
        array.add("Salut");
        System.out.println(array);
        array.add(1, "Aurevoir");
        System.out.println(array);
       	System.out.println(array.contains("Bonjour"));
       	System.out.println(array.get(2));
       	String suppr = array.remove(1);
       	System.out.println(array);
       	System.out.println(suppr);
       	System.out.println("Taille de la liste:" + array.size());
       	array.set(1,  "Pikachu");
       	System.out.println(array);
        
    }
}