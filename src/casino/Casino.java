package casino;

import java.util.Random;
import java.util.Scanner;

public class Casino {
	public static int nbTentatives = 5;
	public static int budget = 1000;
	public static int mise = 0;
	public static int nbMystere =0;
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("        ============= BIENVENUE, JOUONS AU JEU DU CHIFFRE MYSTERE ============== ");
		nbMystere = (new Random()).nextInt(22);	
		
		System.out.println("Règle du jeu: Vous devez choisir un nombre aleatoire en 0 et 22; Vous disposez de "+nbTentatives + " tentatives");
		System.out.println("        *******************************************************************************************");
		do {
			System.out.println("Votre budget est de :" +budget + "€");
			System.out.println("Veuillez saisir un montant de mise:");
				mise = scanner.nextInt();
				budget -= mise;
			System.out.println("Votre Mise est de : "+mise + "€ "+";"+" Votre budget restant est de:"+budget+ "€");	
			Game.game( budget, mise, nbMystere);
			System.out.println("       **********************************************************************************");	
				
				mise =0;//reset mise
				nbTentatives -=1;
		}while(TryGame.tryGame(nbTentatives) && PlayAgain.playAgain(budget, mise));
		
		
		System.out.println("============== FIN DU JEUX ============");
	}

}
