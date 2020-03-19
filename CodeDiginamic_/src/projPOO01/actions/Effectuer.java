package projPOO01.actions;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.List;

import projPOO01.GestionAchat.Achat;
import projPOO01.GestionAchat.commande;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.IFournisseur;
import projPOO01.Menu.Menus;
import projPOO01.saisie.Saisir;

public class Effectuer {
	
	/**
	 * @author antoinethebault
	 * EffectuerAchat : permet de choisir un client et saisir un achat via les methodes appelees
	 */
	public static void EffectuerAchat() {
		Regrouper.RegrouperIClient();
		IClient client = Choisir.ChoisirIClient(Regrouper.listeclient);
		Instant instant1 = Instant.now();
		List<Achat> a = Saisir.SaisirAchat();
		Instant instant2 = Instant.now();
		Duration duration = Duration.between(instant1, instant2);
		System.out.println("La saisie a duree "+duration.toMinutes()+" minutes et "+duration.toSeconds()+" secondes.");
		
		client.achete(a);
		client.paie();
		Menus.Menu();	
	}
	
	/**
	 * @author antoinethebault
	 * EffectuerCommande : permet de choisir un fournisseur parmis une liste et de saisir une commande via les methodes appelees
	 */
	public static void EffectuerCommande() {
		Regrouper.RegrouperIFournisseur();
		IFournisseur f = Choisir.ChoisirIFournisseur(Regrouper.listifournisseur);
		Instant instant1 = Instant.now();
		List<commande> c = Saisir.SaisirCommande();
		Instant instant2 = Instant.now();
		Duration duration = Duration.between(instant1, instant2);
		System.out.println("La saisie a duree "+duration.toMinutes()+" minutes et "+duration.toSeconds()+" secondes.");
		f.commande(c);
		f.livre();
		Menus.Menu();	
	}
}
