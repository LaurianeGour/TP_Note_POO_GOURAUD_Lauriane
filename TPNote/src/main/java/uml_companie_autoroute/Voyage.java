package uml_companie_autoroute;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Voyage {
	final static Logger logger = LogManager.getLogger(Voyage.class);
	/**
	 * Attributs : entree, sortie, tarif, autoroute Suivis de leurs getters /
	 * setters
	 */
	private Porte entree;
	private Porte sortie;
	private BigDecimal tarif;
	private CompagnieAutoroute autoroute;

	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public BigDecimal getTarif() {
		return tarif;
	}

	public void setTarif(BigDecimal tarif) {
		this.tarif = tarif;
	}

	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}

	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}

	/**
	 * Constructeur: initialisant les attributs
	 */
	public Voyage(Porte pEntree, Porte pSortie, BigDecimal tarifVoyage, CompagnieAutoroute autorouteVoyage){
		entree = pEntree;
		sortie = pSortie;
		tarif = tarifVoyage;
		autoroute = autorouteVoyage;
		logger.trace("voyage créé et tous les attributs sont initialisés");
	}
	
	
	/**
	 * Main :
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
