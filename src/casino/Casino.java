package casino;

import java.util.Random;
import java.util.Scanner;

public class Casino {
	public static int nbTentatives = 5;
	public static int budget = 1000;
	public static int mise = 0;
	public static int nbMystere= (new Random()).nextInt(22);
	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("        ============= BIENVENUE, JOUONS AU JEU DU CHIFFRE MYSTERE ============== ");
				
		System.out.println("Règle du jeu: Vous devez choisir un nombre aleatoire en 0 et 22; Vous disposez de "+nbTentatives + " tentatives");
		System.out.println("        *******************************************************************************************");
		
		//PlaySystem.playSystem(budget, mise, nbMystere, nbTentatives);
		FindAge.getAge();
		
		System.out.println("============== FIN DU JEUX ============");
	}
/* voir pour mise supérieure à 1000e et mise inférieure à 0e */
// cleanner le code
	
}
