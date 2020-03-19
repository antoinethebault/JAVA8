package entites;

import java.util.Date;


/**
 * @author Christophe Germain
 * @version 1.0
 * <br> <b> Java Doc pour la POE Lyon 02</b>
 */

public class Personne {
	/**
	 *  JAVADOC
	 *  nom de la personne : obligatoire
	 */
	private String nom;
	/**
	 *  JAVADOC
	 *  prénom de la personne : obligatoire
	 */
	private String prenom;
	private Date dateNaissance;
	private Integer age;
	
	public Personne() {
		// TODO Auto-generated constructor stub
		this("","",new Date());
	}
	
	/**
	 * Constructeur de la classe Personne
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Personne(String nom, String prenom, Date dateNaissance) {
		super();
		/* commentaire normal
		 * TEST
		 *  */
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.age = 0;
	}

	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * @return <b> Le nom de la Personne </b>
	 */
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public Integer getAge() {
		return age;
	}
	
	
	

}

