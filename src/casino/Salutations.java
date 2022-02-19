package casino;

public class Salutations {
	//salue l'utilisateur, lui demande son nom et son age si plus de 18 ans peut jouer
	// si moins interdit
	// reccup nomUser pour le return lors de discution avec user
	public static void salut() {
		System.out.println("bonjour Veuillez saisir votre nom:");
		String userName = Casino.scanner.nextLine();
		
		System.out.println("Veuillez saisir votre date de naissance(JJ/MM/AAAA:");
		String userBirthDate = Casino.scanner.nextLine();
		// transformation date de naissance en age
		
		
		
		//verif age
		System.out.println("Désolé, nomUser, vous avez -de 18ans , l'acces vous est interdit");
	
		System.out.println("b");
	
	}

}
