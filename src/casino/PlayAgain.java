package casino;

public class PlayAgain {
	
	//methode pour déterminer condition selon laquelle on peut continuer à jouer = tant qu'on a de l'argent et assez de tentatives
	
	public static boolean playAgain(int budget, int mise) {
	
		//continuer à jouer en fonction du budget
			if(budget>0 ) {
						
						//continuer à jouer si le player souhaite rester
							System.out.println("continuer à jouer? :(y/n)");
							String yes = Casino.scanner.next();
							if(yes.equals( "y")) {
								if( budget>=mise) {
									
								return true;
								}else {
								System.out.println("attention!!! mise supérieur à votre budget de : " +budget + "€");
								return false;
								}
							}else {
								System.out.println("aurevoir! votre budget restant est de : " + budget+ "€");
								return false;
							}
					
						
		}else {
			System.out.println("impossible de jouer vous n'avez plus de budget");
			return false;
			}
											
	}
	
}