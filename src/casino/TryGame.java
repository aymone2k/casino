package casino;

public class TryGame {

	
	public static boolean tryGame(int nbTentatives){
		// retournnera le nombre de tentatives restantes 
				
		while(nbTentatives>0) {
			//continuer à jouer
			if(nbTentatives == 1) {
				System.out.println("Attention!!! c'est votre dernière tentative!!!");
				return true;
			}
			System.out.println("Il vous reste "+nbTentatives);
			return true;
			
		}
		System.out.println("Plus de tentatives possibles");
		return false;
	}
}
