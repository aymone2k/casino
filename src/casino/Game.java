package casino;


public class Game {

	public static boolean game(int budget, int mise, int nbMystere, int nbPlay) {
		//methode pour vérifier si le nbre mystere est trouvé 
	
		//System.out.println(nbMystere);
		
		
		if(nbPlay == nbMystere) {
			System.out.println("BRAVO! NOUS DOUBLONS VOTRE MISE, VOUS GAGNEZ: " +mise*2+ "€");
			//créditer le compte
			budget +=(mise * 2);
			System.out.println("VOTRE BUDGET RESTANT EST DE: " +budget + "€");
			
			return true;
		}else {
			System.out.println("DOMMAGE! VOUS PERDEZ: " +mise+ "€");
			
			System.out.println("VOTRE BUDGET RESTANT EST DE : " +budget + "€");
			//informer du solde restant
			
			return false;
		}
		
	}
	

}
