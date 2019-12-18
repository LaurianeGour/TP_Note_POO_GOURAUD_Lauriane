package uml_companie_autoroute;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Boolean;

public class Porte {
	final static Logger logger = LogManager.getLogger(Porte.class);
	/**
	 * Attribut : numero de porte Suivis de getters / setters
	 */
	private int numeroDePorte;

	public int getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(int numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	/**
	 * Constructeurs : Pour un certain int
	 */
	Porte(int valPorte) {
		numeroDePorte = valPorte;
		logger.trace("Porte " + numeroDePorte + " créée");
	}

	/**
	 * Equals
	 */

	/**
	 * toString - ok
	 */
	public String toString() {
		return " Porte : " + numeroDePorte;
	}
	
	/**
	 * hashCode
	 */
	public int hashCode() {
		return numeroDePorte;
	}
	
	
	/**
	 * Main :
	 */
	public static void main(String[] args) {
		Porte porte1 = new Porte(1);
		Porte porte2 = new Porte(2);
		Object porte2bis = new Porte(2);
		
		boolean isEqual = porte2.equals(porte2bis);
		logger.trace("porte 2 et porte 2 bis : " + isEqual);
		
		isEqual = porte1.equals(porte2bis);
		logger.trace("porte 1 et porte 2 bis : " + isEqual);
	}

}
