package casino;

public class TryGame {

	
	public static boolean tryGame(int nbTentatives, int nbMystere){
		// retournnera le nombre de tentatives restantes 
			
		while(nbTentatives>0 ) {
			
			//continuer à jouer
			if(nbTentatives == 1) {
				System.out.println("ATTENTION!!! c'est votre dernière tentative!!!");
				return true;
			}
			System.out.println("ATTENTION!!  Il ne vous reste plus que "+nbTentatives + " tentatives");
			return true;
			
		}
		System.out.println("Plus de tentatives possibles");
		return false;
	}
}
