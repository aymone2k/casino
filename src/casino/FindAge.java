package casino;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

// calcule l'age de l'utilisateur
public class FindAge {
	int userAge;
	public static void getAge(String userName,long userAge,int budget, int mise, int nbTentatives, int nbMystere, int nbPlay){
	String userBirthDate;
		
		do {//dde de saisir une date tant que le format ne correspond pas
	    System.out.println("Veuillez saisir votre date de naissance(JJ/MM/AAAA) :");
		userBirthDate = Casino.scanner.nextLine();
		if(userBirthDate.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
			    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			    Date userDate = null;
				try {
				userDate = f.parse(userBirthDate);
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   				
			//doit faire: reccup userBith et le comparer à la date d'aujourdhui, et retourner l'age
				
				LocalDate toDay = LocalDate.now();
				LocalDate userBirth = userDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				userAge = ChronoUnit.YEARS.between(userBirth,toDay);
				System.out.println("Vous avez "+ userAge +" an(s)");
				long limitAge = 18;
				int result = Long.compare(userAge, limitAge);
				//System.out.println(userAge);
				//System.out.println(limitAge);
				//System.out.println(result);
				//verif age
				if(result >= 0) {
					//jouer

					System.out.println("        ============= BIENVENUE " +userName+", JOUONS AU JEU DU CHIFFRE MYSTERE ============== ");
					System.out.println("        *******************************************************************************************");
					System.out.println("  *****  Les Règles du jeu: *****  ");
					System.out.println(" Pour remporter la mise, Vous devez trouver le nombre mystère en selectionnant un nombre aleatoire en 0 et 22;");
					System.out.println("Vous disposez de "+nbTentatives + " tentatives");	
					System.out.println("        *******************************************************************************************");
					
					PlaySystem.playSystem(budget, mise, nbTentatives, nbMystere, nbPlay);
				
				}
				else {
					
					System.out.println("######## Désolé "+userName+" vous avez -de 18ans , l'acces vous est interdit!#########");
				}
				
			}else {
		  System.out.println("ATTENTION!! ERREUR DE FORMAT, Veuillez saisir une date au fomart JJ/MM/AAAA");}}
		while(userBirthDate.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")== false);
	}
	
	
}
