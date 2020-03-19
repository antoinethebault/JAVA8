package projPOO01.Controles;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionInt;

/**
 * @author antoinethebault
 *Controles : effectue des controles sur des donnees saisies
 */
public class Controles {

	/**
	 * CtrlDate
	 * @author antoinethebault
	 * effectue une controle sur la date au format dd/MM/yyyy sinon renvoie un message
	 * d'erreur
	 * @param d
	 * @return
	 * @throws ExceptionDate
	 */
	public static LocalDate CtrlDate(String d) throws ExceptionDate{
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		sd.setLenient(false);
		LocalDate dt = null;
		try {
			//dt =sd.parse(d);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
			//String text = dt.format(formatter);
			dt = LocalDate.parse(d, formatter);
			
		}catch(Exception e) {
			throw new ExceptionDate("Mauvais format de date saisi");
		}
		return dt;
	}
	
	/**
	 * CtrlInt
	 * @author antoinethebault
	 * verifie que la chaine entree en parametre est un entier
	 * renvoie un message d'erreur sinon
	 * @param ns
	 * @throws ExceptionInt
	 */
	public static void CtrlInt(String ns) throws ExceptionInt{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
		}catch(Exception e) {
			throw new ExceptionInt("Veuillez saisir un entier");
		}
		
		}
	
}
