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
	public  Porte(int valPorte) {
		numeroDePorte = valPorte;
		logger.trace("Porte " + numeroDePorte + " créée");
	}

		
	/**
	 * toString - ok
	 */
	public String toString() {
		return " Porte : " + numeroDePorte;
	}
	
	/**
	 * Equals - ok
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Porte other = (Porte) obj;
		if (numeroDePorte != other.numeroDePorte)
			return false;
		return true;
	}
	
	/**
	 * hashCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroDePorte;
		return result;
	}
	
	
	/**
	 * Main : verifier que le equals soit bon
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
