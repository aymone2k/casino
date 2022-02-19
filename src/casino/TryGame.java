package casino;

public class TryGame {

	
	public static boolean tryGame(int nbTentatives, int nbMystere, int nbPlay){
		// retournnera le nombre de tentatives restantes 
		//System.out.println(nbPlay);
		//System.out.println(nbMystere);
		while(nbTentatives>0 && nbPlay != nbMystere) {
			
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
