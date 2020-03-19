package interfaces;

import java.util.List;
/**
 * 
 * Comme son nom l'indique, les méthodes par défaut de 
 * Java 8 sont simplement des méthodes par défaut. 
 * Si vous ne les remplacez pas, ce sont les méthodes 
 * qui seront invoquées par les classes appelantes. 
 * Ils sont définis dans les interfaces.
 * 
 * @author christophe GERMAIN
 * @since JDK 1.8
 */
public interface IClient {
/**
 * 
 * @return true par défaut
 */
	default public Boolean isClient() {
		return true;
	}
/**
 * Prévoir un attribut de type List d'Object
 * dans la classe qui va implémenter cette interface
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