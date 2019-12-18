package uml_companie_autoroute;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tarif {
	final static Logger logger = LogManager.getLogger(Tarif.class);
	/**
	 * Attributs : entree, sortie, dateValidite, et prix Suivis de leurs getters /
	 * setters
	 */
	private Porte entree;
	private Porte sortie;
	private LocalDateTime dateValidite;
	private BigDecimal prix;

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

	public LocalDateTime getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	/**
	 * Constructeur: initialisant les attributs
	 */
	Tarif(Porte newEntree, Porte newSortie, LocalDateTime newDateValidite, BigDecimal newPrix) {
		entree = newEntree;
		sortie = newSortie;
		dateValidite = newDateValidite;
		prix = newPrix;
		logger.trace("Tarif créé et tous les attributs sont initialisés");

	}

	/**
	 * toString - ok
	 */
	public String toString() {
		return "Le tarif de la porte " + entree.getNumeroDePorte() + " jusqu'à la porte " + sortie.getNumeroDePorte()
				+ " pour la date " + dateValidite + " est de " + prix;
	}

	/**
	 * Main :
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
