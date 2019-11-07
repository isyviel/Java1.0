package voiture;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entrée clavier
		Scanner scanner = new Scanner(System.in);
		String couleur = scanner.nextLine();
		Voiture voiture = new Voiture(couleur);
		System.out.println(voiture.couleur);

		}

}
