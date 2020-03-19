package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Achat;

/**
 * @author antoinethebault IClient
 */
public interface IClient {
	public void achete(List<Achat> listachat);

	public boolean paie();
	// public boolean isClient();

	/**
	 * 
	 * @return true par défaut
	 */
	default public Boolean isClient() {
		return false;
	}

	/**
	 * Prévoir un attribut de type List d'Object dans la classe qui va implémenter
	 * cette interface
	 * 
	 * @param la de type List d'Object
	 */
	public void acheter(List<Object> la);

	/**
	 * 
	 * @return false par défaut
	 */
	default public Boolean payer() {
		return false;
	}
}
