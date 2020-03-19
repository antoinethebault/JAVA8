package projPOO01.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import projPOO01.actions.Effectuer;
import projPOO01.affichages.Affichages;
import projPOO01.saisie.Saisir;



/**
 * @author antoinethebault
 *Menus : affiche le menu global et le menu de saisie
 */
public class Menus {
	public static Scanner sc =null;
	public static int choixmenu;
	
	private static String choix = null;
	
	/**
	 * @author antoinethebault
	 * quitter : permet de quitter l'application
	 */
	public static void quitter() {
		System.exit(0);
	}
			
	/**
	 * @author antoinethebault
	 * Menu : affiche le menu d'accueil et appel les methodes correspondantes au choix
	 */
	public static void Menu() {
		Map<String, iExecute> im1 = new HashMap<String,iExecute>();

		im1.put("1 Saisir des données",Menus::Saisir);
		im1.put("2 Afficher des données",Affichages::Afficher);
		im1.put("3 Saisir des achats",Effectuer::EffectuerAchat);
		im1.put("4 Saisir des commandes",Effectuer::EffectuerCommande);
		im1.put("5 Quitter",Menus::quitter);
		im1.keySet().stream().sorted().forEach(System.out::println);
		
		while(true) {
		
		choix = sc.next();
		
		im1.entrySet().stream().filter(e->e.getKey().charAt(0) == choix.charAt(0)).
		forEach(e->e.getValue().apply());
					
		}
		
		
	}

	
	/**
	 * @author antoinethebault
	 * Saisir : affiche le menu de saisie et appelle les fonctions correspondantes
	 */
	public static void Saisir() {
				
		Map<String, iExecute> im1 = new HashMap<String,iExecute>();

		im1.put("1 pour saisir toutes les données", Saisir::SaisirAll);
		im1.put("2 pour saisir les salariés",Saisir::SaisirSalarie);
		im1.put("3 pour saisir les clients", Saisir::SaisirClient);
		im1.put("4 pour saisir les fournisseur",Saisir::SaisirFournisseur);
		im1.put("5 pour saisir le patron",Saisir::SaisirPatron);
		im1.put("6 pour saisir un interimaire",Saisir::SaisirInterimaire);
		im1.put("7 pour saisir une personne", Saisir::saisirPersonne);
		im1.put("8 pour retourner au menu",Menus::Menu);
		im1.keySet().stream().sorted().forEach(System.out::println);
		
		while(true) {
			
			choix = sc.next();
			
			im1.entrySet().stream().filter(e->e.getKey().charAt(0) == choix.charAt(0)).
			forEach(e->e.getValue().apply());
						
			}

	}
}
