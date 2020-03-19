package entites;

import java.util.Date;
import java.util.List;

import interfaces.IClient;

/**
 * 
 * @author christophe germain
 * 
 * La classe Client impl�mente l'interface :
 * @see IClient
 */

public class Client extends Personne implements IClient {

	public Client(String nom, String prenom, Date dateNaissance) {
		super(nom, prenom, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	 /**
	  * On a uniquement la m�thode acheter � surcharger
	  * car toutes les autres m�thodes de l'interface
	  * ont un comportement par <b>"d�faut"</b>.
	  */
	@Override
	public void acheter(List<Object> a) {
		// TODO Auto-generated method stub
		
	}

}
