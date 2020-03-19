package projPOO01.GestionPersonnes;

import java.text.DecimalFormat;

import projPOO01.Exceptions.ExceptionSaisieContratAgence;
import projPOO01.Exceptions.ExceptionSaisieDuree;

/**
 * @author antoinethebault
 *Interimaire : classe heritant de Salarie, heritant elle-meme de Personne
 *possede un numero contratAgence en attribut
 */
public class Interimaire extends Salarie {

	/**contratAgence : String le numero de contrat de l'agence de l'interimaire*/
	String contratAgence;
	/**duree : int la duree en mois*/
	int duree;
	
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu, double salaire, String contratAgence, int duree) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.contratAgence = contratAgence;
		this.duree=duree;
	}

	/**
	 * verifContratAgence verifie la longueur de 5 caracteres de la chaine du contrat d'agence
	 * @param contratAgence
	 * @return
	 * @throws ExceptionSaisieContratAgence 
	 */
	public static void verifContratAgence(String contratAgence) throws ExceptionSaisieContratAgence{
		if (contratAgence.length()<5)
			throw new ExceptionSaisieContratAgence("Le contrat d'agence doit avoir 5 caracteres au minimum.");
			
	}
	
	/**
	 * verifSaisieDuree verfie si la duree depasse un mois
	 * @param duree
	 * @throws ExceptionSaisieDuree
	 */
	public static void verifSaisieDuree(int duree) throws ExceptionSaisieDuree {
		if (duree<=1)
			throw new ExceptionSaisieDuree("La duree doit etre superieures a un mois");
			
	
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return super.toString()+" [contrat="+contratAgence+", duree="+duree+"]";
	}

	/**Getter
	 * @return the contratAgence
	 */
	public String getContratAgence() {
		return contratAgence;
	}

	/**Getter
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**Setter
	 * @param contratAgence the contratAgence to set
	 */
	public void setContratAgence(String contratAgence) {
		this.contratAgence = contratAgence;
	}

	/**Setter
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
}
