package projPOO01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import projPOO01.Menu.Menus;


/**
 * @author antoinethebault
 *Programme : point d'entree du programme
 *appel le menu
 */
public class Programme {

	
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String text = date.format(formatter);
		Afficher a = (s) -> System.out.println(s);
		a.afficher(text);
		
		Menus.sc = Programme.sc;
		
		Menus.Menu();

	}
	

}
