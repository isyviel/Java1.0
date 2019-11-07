package voiture;

public class ExerciceString {

	public static void main(String[] args) {
	    String s = "bonjour";
	 	s = s.toUpperCase();
	    System.out.println(s); // "BONJOUR"
	    s = s.toLowerCase();
	    System.out.println(s); // "bonjour"
	    char c;
	    c = s.charAt(3);
	    System.out.println(c); // 'j'
	    
	    String mot1 = "Bonjour";
	    String mot2 = "Au Revoir";
	    String mot3 = "Ordinateur";
	    String mot4 = "jour";
	    boolean b1; // mot1.
	    boolean b2; // mot2.
	    boolean b3; // mot3.
	    boolean b4; // mot4.
	    //est ce quil y a un j dans le mot
	    b1 = mot1.endsWith("jour");
	    b2 = mot2.endsWith("jour");
	    b3 = mot3.endsWith("jour");
	    b4 = mot4.endsWith("jour");
	    System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
	    // vrai faux faux vrai
	    
	    int p; // mot1, 'j'
	    p = mot1.indexOf(c);
	    System.out.println(p); // 3
	    
	    int l; // mot3
	    l = mot3.length();
	    System.out.println(l); // 10
	    
	    String mot1_bis; // mot1, 'o', 'a'
	    mot1_bis = mot1.replace('o', 'a');
	    System.out.println(mot1_bis); // "Banjanr"
	    
	    for(int i = 0 ; i < 3 ; i++) {
	        String mot1_part; // mot1, i
	        mot1_part = mot1.split("o")[i];
	        System.out.println(mot1_part);
	    }
	    // "B"
	    // "nj"
	    // "ur"
	    
	}
}
