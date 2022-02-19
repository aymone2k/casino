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
	public static void getAge(long userAge){
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
				
			}else {
		  System.out.println("ATTENTION!! ERREUR DE FORMAT, Veuillez saisir une date au fomart JJ/MM/AAAA");}}
		while(userBirthDate.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")== false);
	}
	
	
}
