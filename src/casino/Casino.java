package casino;

import java.util.Random;
import java.util.Scanner;

public class Casino {
	public static int nbTentatives = 5;
	public static int budget = 1000;
	public static int mise = 0;
	public static int nbMystere= (new Random()).nextInt(22);
//	public static int nbPlay;
	//public static int nbPlaySave;
	public static long userAge;
	public static String userName;
	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		Salutations.salut(userName, userAge,budget, mise, nbTentatives, nbMystere );
		
		System.out.println("============== FIN DU JEUX ============");
	}
/* voir pour mise sup�rieure � 1000e et mise inf�rieure � 0e */
// cleanner le code
	
}
