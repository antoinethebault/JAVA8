package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.commande;

/**
 * @author antoinethebault
 *IFournisseur
 */
public interface IFournisseur {
	public default boolean livre() {
		return false;
	}
	public void commande(List<commande> listcommande);
	public default boolean isFournisseur() {
		return true;
	}
}
