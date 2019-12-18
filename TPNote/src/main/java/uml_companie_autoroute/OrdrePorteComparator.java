package uml_companie_autoroute;

import java.util.Comparator;
import java.util.List;
import java.lang.Boolean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrdrePorteComparator implements Comparator<Porte> {
	final static Logger logger = LogManager.getLogger(OrdrePorteComparator.class);
	
	
	/**
	 * Compare
	 */
	public int compare(Porte arg0, Porte arg1) {		
		return arg0.getNumeroDePorte() - arg1.getNumeroDePorte();
	}


	/**
	 * Equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
	/**
	 * Main :
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	
}
