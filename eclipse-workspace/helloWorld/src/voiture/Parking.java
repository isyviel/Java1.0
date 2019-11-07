package voiture;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture batmobil = new Voiture();
		Voiture impala = new Voiture();
		Voiture ouiOui = new Voiture();
		System.out.println(batmobil.getCouleur());
		
		batmobil.setCouleur("noire");
		impala.setCouleur("chrome");
		ouiOui.setCouleur("jaune");
		
		System.out.println(batmobil.getCouleur());
		System.out.println(impala.getCouleur());
		System.out.println(ouiOui.getCouleur());
		
		System.out.println(Voiture.getNombre());
		
		batmobil.setRdispo(3);
		System.out.println(batmobil.getRdispo());
		impala.setRdispo(5);
		System.out.println(impala.getRdispo());
		ouiOui.setRdispo(5);
		System.out.println(ouiOui.getRdispo());
		System.out.println("********************");
		ouiOui.perdreRoue(1);
		System.out.println(ouiOui.getRdispo());
		System.out.println("********************");
		System.out.println(Voiture.getRoue());
		
		}
}
