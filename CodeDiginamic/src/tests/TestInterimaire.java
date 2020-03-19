package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

import projPOO01.Exceptions.ExceptionSaisieContratAgence;
import projPOO01.Exceptions.ExceptionSaisieDuree;
import projPOO01.GestionPersonnes.Interimaire;
import projPOO01.GestionPersonnes.Salarie;

public class TestInterimaire {
	private Interimaire i;
	private final String onom ="Personne";
	private final String oprenom ="Test";
	private final String oville ="Lyon";
	private final String oadresse ="Rue";
	private final String ocodepostal ="69000";
	private final String osecu = "oopp";
	private final Long osalaire =0L;
	private final String contratAgence="12345";
	private final int duree=2;
	private final String setsecu = "";
	private final Long setsalaire =12L;
	private final DecimalFormat df = new DecimalFormat("0.00");
	private final String ts= "Interimaire [nom=" + onom + ", prenom=" + oprenom + ", adresse=" + oadresse + ", ville=" + oville
			+ ", codepostal=" + ocodepostal + "]" + " [secu=" + osecu + ", salaire=" + df.format(osalaire) + "] [contrat="+contratAgence+", duree="+duree+"]";

	
	@Before
	public void init() {
		i = new Interimaire(onom,oprenom,oadresse,oville,ocodepostal,osecu,osalaire,contratAgence,duree);
	}
	
	@Test
	public void testToString() {
		assertEquals(ts,i.toString());
	}
	
	@Test
	public void testInterimaire() {
		assertNotNull(i);
	}
	
	@Test
	public void testPaie() {
		assertTrue(i.paie());
	}
	
	@Test
	public void testIsClient() {
		assertFalse(i.isClient());
	}

	@Test
	public void testGetSecu() {
		assertEquals(osecu,i.getSecu());
	}

	@Test
	public void testSetSecu() {
		i.setSecu(setsecu);
		assertEquals(setsecu, i.getSecu());
	}

	@Test
	public void testGetSalaire() {
		assertEquals(df.format(osalaire),df.format(i.getSalaire()));
	}

	@Test
	public void testSetSalaire() {
		i.setSalaire(setsalaire);
		assertEquals(df.format(setsalaire),df.format(i.getSalaire()));
	}
	
	@Test(expected=ExceptionSaisieContratAgence.class)
	public void testVerifContratAgence() throws ExceptionSaisieContratAgence {
		Interimaire.verifContratAgence("1234");
	}
	
	@Test(expected=ExceptionSaisieDuree.class)
	public void testVerifSaisieDuree() throws ExceptionSaisieDuree {
		Interimaire.verifSaisieDuree(1);
	}
	
}
