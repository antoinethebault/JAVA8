package projPOO01.GestionPersonnes;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

import ProjetPOO01.Enumerations.EFournisseur;
import projPOO01.Exceptions.ExceptionNumeroUnique;
import projPOO01.GestionAchat.Achat;
import projPOO01.GestionAchat.commande;

/**
 * @author antoinethebault
 *Fournisseur heritant de la classe Personne et ayant un idfournisseur et une liste de commandes
 *en attribut
 */
public class Fournisseur extends Personne implements IClient, IFournisseur {

	private int idfournisseur;
	private List<commande> commandes = new ArrayList<commande>();

	public Fournisseur(String nom, String prenom, String adresse, String ville, String codepostal, int idfournisseur) {
		super(nom, prenom, adresse, ville, codepostal);
		// TODO Auto-generated constructor stub
		this.idfournisseur = idfournisseur;
	}
	
	public Fournisseur(Dictionary<EFournisseur, String> di) {
		super(di.get(EFournisseur.nom), di.get(EFournisseur.prenom), di.get(EFournisseur.adresse), di.get(EFournisseur.ville), di.get(EFournisseur.codepostal));
		this.idfournisseur= Integer.parseInt(di.get(EFournisseur.idfournisseur));
	}

	
	
	public List<commande> getCommandes() {
		return commandes;
	}

	@Override
	public String toString() {
		return super.toString() + "[idfournisseur=" + idfournisseur + ", commandes=" + commandes+"]";
	}



	public int getIdfournisseur() {
		return idfournisseur;
	}


	public void setIdfournisseur(int idfournisseur) {
		this.idfournisseur = idfournisseur;
	}


	@Override
	public void achete(List<Achat> listachat) {
		// TODO Auto-generated method stub
		System.out.println("Fournisseur achete");
	}

	@Override
	public boolean paie() {
		// TODO Auto-generated method stub
		System.out.println("Fournisseur paie");
		return true;
	}

	@Override
	public boolean livre() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void commande(List<commande> listcommande) {
		// TODO Auto-generated method stub
		this.commandes = listcommande;
	}



	@Override
	public Boolean isClient() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isFournisseur() {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**
	 * CtrlNumeroUniqueFournisseur
	 * @author antoinethebault
	 * verifie que le numero fourni en parametre est un entier et qu'il n'est pas deja utilise
	 * sinon des erreurs sont renvoyees
	 * @param ns
	 * @param list
	 * @throws ExceptionNumeroUnique
	 */
	public static void CtrlNumeroUniqueFournisseur(String ns, ArrayList<Fournisseur> list) throws ExceptionNumeroUnique{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
				
			
		}catch(Exception e) {
			throw new ExceptionNumeroUnique("Le numero saisi n'est pas un entier");
		}
		for(Fournisseur c1:list) 
		{
			if(n!=c1.getIdfournisseur()) {
				
			}else {
				throw new ExceptionNumeroUnique("Le numero unique est d�ja utilis�");
				
			}
		}
		
	}

	@Override
	public void acheter(List<Object> la) {
		// TODO Auto-generated method stub
		
	}

}
