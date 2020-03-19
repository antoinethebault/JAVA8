package entites;

import java.util.Date;
import java.util.List;

import interfaces.IClient;

/**
 * 
 * @author christophe germain
 * 
 * La classe Client implémente l'interface :
 * @see IClient
 */

public class Client extends Personne implements IClient {

	public Client(String nom, String prenom, Date dateNaissance) {
		super(nom, prenom, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	 /**
	  * On a uniquement la méthode acheter à surcharger
	  * car toutes les autres méthodes de l'interface
	  * ont un comportement par <b>"défaut"</b>.
	  */
	@Override
	public void acheter(List<Object> a) {
		// TODO Auto-generated method stub
		
	}

}
