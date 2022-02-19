package casino;

public class PlaySystem {

	public static void playSystem(int budget, int mise, int nbTentatives , int nbMystere, int nbPlay) {
		do {
			System.out.println("Votre budget est de :" +budget + "€");
			System.out.println("Veuillez saisir un montant de mise:");
				mise = Casino.scanner.nextInt();
				budget -= mise;
			System.out.println("Votre Mise est de : "+mise + "€ "+";"+" Votre budget restant est de:"+budget+ "€");	
			
			System.out.println("Veuillez saisir un nombre entre 0 et 22 ");
			nbPlay = Casino.scanner.nextInt();
			//System.out.println(nbPlay);
			System.out.println("pour info le nombre mystère est :"+nbMystere);
			Game.game( budget, mise, nbMystere, nbPlay);
			System.out.println("       **********************************************************************************");	
				
				mise =0;//reset mise
				nbTentatives -=1;
		}while(TryGame.tryGame(nbTentatives, nbMystere, nbPlay) && PlayAgain.playAgain(budget, mise));
	}
}
