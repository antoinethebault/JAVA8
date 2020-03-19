package projPOO01.GestionAchat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author antoinethebault
 *commande : definit une commande definie par un intitule, une date precise et une quantite
 */
public class commande {
	private LocalDate date;
	private String intitule;
	private int quantite;
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	
	public commande(LocalDate d, String i, int q) {
		// TODO Auto-generated constructor stub
		this.date = d;
		this.intitule = i;
		this.quantite = q;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return intitule + "[date=" +date.format(formatter) + ", quantite=" + quantite + "]";
	}
	
	

}
