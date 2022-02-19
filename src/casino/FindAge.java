package casino;

import java.text.SimpleDateFormat;
import java.util.Date;

// calcule l'age de l'utilisateur
public class FindAge {
	
	public static void getAge() {
	System.out.println("Veuillez saisir votre date de naissance(JJ/MM/AAAA) :");
	String userBirthDate = Casino.scanner.nextLine();
	
	//controle de saisir
	//penser à modifier en dowhile cad redemander la saisie de t'age tantke format incorrecte
	if(userBirthDate.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
	   // SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
	    //Date date = f.parse(sDate);
	    //comparer l'age
		System.out.println("Coucou");
	}
	else {
	    System.out.println("ATTENTION!! ERREUR DE FORMAT, Veuillez saisir une date au fomart JJ/MM/AAAA");
	}
	}
	
	public static void verifAge() {}

}
