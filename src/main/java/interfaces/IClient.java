package interfaces;

import java.util.List;
/**
 * 
 * Comme son nom l'indique, les m�thodes par d�faut de 
 * Java 8 sont simplement des m�thodes par d�faut. 
 * Si vous ne les remplacez pas, ce sont les m�thodes 
 * qui seront invoqu�es par les classes appelantes. 
 * Ils sont d�finis dans les interfaces.
 * 
 * @author christophe GERMAIN
 * @since JDK 1.8
 */
public interface IClient {
/**
 * 
 * @return true par d�faut
 */
	default public Boolean isClient() {
		return true;
	}
/**
 * Pr�voir un attribut de type List d'Object
 * dans la classe qui va impl�menter cette interface
 * @param la de type List d'Object
 */
	public void acheter(List<Object> la);

	/**
	 * 
	 * @return false par d�faut
	 */
	default public Boolean payer() {
		return false;
	}

}