package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionAchat.commande;

public class TestCreerUneCommande {
	
	private commande c;
	private final LocalDate od = LocalDate.now();
	private final String oi = "intitule";
	private final Integer oqte= new Integer(10);
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private final String ts = oi + "[date=" +od.format(formatter) + ", quantite=" + oqte + "]";
	
	@Before
	public void init() {
		c = new commande(od,oi,oqte);
	}
	
	
	@Test
	public void testCommande() {
		assertNotNull(c);
	}

	@Test
	public void testToString() {
		assertEquals(ts,c.toString());
	}

}
