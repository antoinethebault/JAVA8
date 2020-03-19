package projPOO01.affichages;

import java.util.ArrayList;

import projPOO01.Afficher;
import projPOO01.Programme;
import projPOO01.GestionPersonnes.Personne;
import projPOO01.Menu.Menus;
import projPOO01.saisie.Saisir;

public class Affichages {

	/**
	 * Afficher
	 * @author antoinethebault 
	 * affiche le menu d'affichage des donnees, permet de faire un choix dans le menu
	 * et appelle la methode associee
	 */
	public static void Afficher() {
		
		
		
		int choix;
		ArrayList<Personne> listpatron = new ArrayList<Personne>();
		listpatron.add(Saisir.patron);
		
		System.out.println("Taper 1 pour afficher toutes les données");
		System.out.println("Taper 2 pour afficher les salariés");
		System.out.println("Taper 3 pour afficher les clients");
		System.out.println("Taper 4 pour afficher les fournisseur");
		System.out.println("Taper 5 pour afficher le patron");
		System.out.println("Taper 6 pour afficher les personnes");
		System.out.println("Taper 7 pour retourner au menu");
		
		choix=Menus.sc.nextInt();
		
		switch(choix) {
		case 1 : AfficherCommun(Affichages.GrouperAffichage());
		break;
		case 2 : AfficherCommun(Saisir.listsalarie);
		break;
		case 3 : AfficherCommun(Saisir.listclient);
		break;
		case 4 : AfficherCommun(Saisir.listfournisseur);
		break;
		case 5 : AfficherCommun(listpatron);
		break;
		case 6 : Affichages.AfficherPersonnes();	
		break;
		case 7 : Menus.Menu();
		break;
		default : Afficher();
		break;
		}
	}
	
	
	private static void AfficherPersonnes() {
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.addAll(Saisir.listsalarie);
		list.addAll(Saisir.listclient);
		list.addAll(Saisir.listfournisseur);
		list.addAll(Saisir.listPersonne);
		list.add(Saisir.patron);
		IAfficherPersonnes a = (s) -> System.out.println("Nom="+s.getNom()+" Prenom="+s.getPrenom()+" Adresse="+s.getAdresse()+" Ville="+s.getVille()+" Code Postal="+s.getCodepostal());
		for (Personne personne : list) {
			a.afficherPersonnes(personne);
		}
		Menus.Menu();
	}


	/**
	 * AfficherCommun
	 * @author antoinethebault
	 * affiche les donnees contenues dans la liste fournie en parametre
	 * @param list
	 */
	public static void AfficherCommun(ArrayList<Personne> list ) {
		for(Personne p:list) {
			System.out.println(p.toString());
		}
		//Menus.RetourMenu();
	}
	
	/**
	 * GrouperAffichage
	 * @author antoinethebault
	 * cree une liste contenant tous les salaries, clients, fournisseurs et le patron
	 * @return
	 */
	public static ArrayList<Personne> GrouperAffichage() {
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.addAll(Saisir.listsalarie);
		list.addAll(Saisir.listclient);
		list.addAll(Saisir.listfournisseur);
		list.add(Saisir.patron);
		
		return list;
	}
	
}
