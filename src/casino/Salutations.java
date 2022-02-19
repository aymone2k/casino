package casino;

public class Salutations {
	//salue l'utilisateur, lui demande son nom et son age si plus de 18 ans peut jouer
	// si moins interdit
	// reccup nomUser pour le return lors de discution avec user
	public static void salut(String userName,long userAge,int budget, int mise, int nbTentatives, int nbMystere, int nbPlay ) {
		System.out.println("          ====================== BONJOUR ===================           ");
		System.out.println("Veuillez saisir votre nom:");
		userName = Casino.scanner.nextLine();
		
		FindAge.getAge(userName, userAge, budget, mise, nbTentatives, nbMystere, nbPlay);
		
		
	
	}

}
