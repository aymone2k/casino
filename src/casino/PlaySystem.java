package casino;

public class PlaySystem {

	public static void playSystem(int budget, int mise, int nbTentatives , int nbMystere) {
		do {
			System.out.println("Votre budget est de :" +budget + "€");
			System.out.println("Veuillez saisir un montant de mise:");
				mise = Casino.scanner.nextInt();
				budget -= mise;
			System.out.println("Votre Mise est de : "+mise + "€ "+";"+" Votre budget restant est de:"+budget+ "€");	
			Game.game( budget, mise, nbMystere);
			System.out.println("       **********************************************************************************");	
				
				mise =0;//reset mise
				nbTentatives -=1;
		}while(TryGame.tryGame(nbTentatives, nbMystere) && PlayAgain.playAgain(budget, mise));
	}
}
