package casino;

public class Salutations {
	//salue l'utilisateur, lui demande son nom et son age si plus de 18 ans peut jouer
	// si moins interdit
	// reccup nomUser pour le return lors de discution avec user
	public static void salut(String userName,long userAge,int budget, int mise, int nbTentatives, int nbMystere ) {
		System.out.println("          ====================== BONJOUR ===================           ");
		System.out.println("Veuillez saisir votre nom:");
		userName = Casino.scanner.nextLine();
		long limitAge = 18;
		FindAge.getAge(userAge);
		
		int result = Long.compare(userAge, limitAge);
		
		//verif age
		if(result <= 0) {
			//jouer

			System.out.println("        ============= BIENVENUE " +userName+", JOUONS AU JEU DU CHIFFRE MYSTERE ============== ");
			System.out.println("        *******************************************************************************************");
			System.out.println("  *****  Les Règles du jeu: *****  ");
			System.out.println(" Pour remporter la mise, Vous devez trouver le nombre mystère en selectionnant un nombre aleatoire en 0 et 22;");
			System.out.println("Vous disposez de "+nbTentatives + " tentatives");	
			System.out.println("        *******************************************************************************************");
			
			PlaySystem.playSystem(budget, mise, nbTentatives, nbMystere);
		
		}
		else {
			
			System.out.println("######## Désolé "+userName+" vous avez -de 18ans , l'acces vous est interdit!#########");
		}
		
	
	}

}
