package casino;

public class PlayAgain {
	
	//methode pour d�terminer condition selon laquelle on peut continuer � jouer = tant qu'on a de l'argent et assez de tentatives
	
	public static boolean playAgain(int budget, int mise) {
	
		//continuer � jouer en fonction du budget
			if(budget>0 ) {
						
						//continuer � jouer si le player souhaite rester
							System.out.println("continuer � jouer? :(y/n)");
							String yes = Casino.scanner.next();
							if(yes.equals( "y")) {
								if( budget>=mise) {
									
								return true;
								}else {
								System.out.println("attention!!! mise sup�rieur � votre budget de : " +budget + "�");
								return false;
								}
							}else {
								System.out.println("aurevoir! votre budget restant est de : " + budget+ "�");
								return false;
							}
					
						
		}else {
			System.out.println("impossible de jouer vous n'avez plus de budget");
			return false;
			}
											
	}
	
}