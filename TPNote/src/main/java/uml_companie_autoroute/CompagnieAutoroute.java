package uml_companie_autoroute;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompagnieAutoroute {

	final static Logger logger = LogManager.getLogger(CompagnieAutoroute.class);
	/**
	 * Attributs : routes (liste de route) et tarifs (liste de tarifs) Suivis de
	 * leurs getters / setters
	 */
	private List<Route> routes;
	private List<Tarif> tarifs;

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public List<Tarif> getTarifs() {
		return tarifs;
	}

	public void setTarifs(List<Tarif> tarifs) {
		this.tarifs = tarifs;
	}

	/**
	 * Constructeur: par defaut : initialisant les attributs
	 */
	public CompagnieAutoroute() {
		routes = new ArrayList<Route>();
		tarifs = new ArrayList<Tarif>();
		logger.trace("Companie Autoroute créée");
	}

	/**
	 * ObtenirTarif
	 */
	public BigDecimal ObtenirTarif(Porte pEntree, Porte pSortie) {
		return GetTarifCalcule(pEntree, pSortie).getPrix();
	}

	/**
	 * GetTarifCalcule
	 */
	private Tarif GetTarifCalcule(Porte pEntree, Porte pSortie) {
		Tarif newTarif = GetTarifExact(pEntree, pSortie) ;
		if (newTarif == null) {
			BigDecimal somme = new BigDecimal(0);
			for(Tarif tarif : tarifs) {
				somme = somme.add(tarif.getPrix());
			}
			newTarif = new Tarif(pEntree, pSortie, somme);
		}
		return newTarif;
	}

	/**
	 * GetTarifExact - ok
	 */
	private Tarif GetTarifExact(Porte pEntree, Porte pSortie) {
		Tarif tarifExact = null; //Si aucun tarif exact n'est trouvé
		for(Tarif tarif : tarifs) {
			if(tarif.getEntree().equals(pEntree) && tarif.getSortie().equals(pSortie)) {
				tarifExact = tarif;
			}
		}
		return tarifExact;
	}

	/**
	 * AjouterTarif - ok
	 */
	public void AjouterTarif(Tarif tarifAAdd) {
		tarifs.add(tarifAAdd);
	}

	/**
	 * AjouterRoute - ok
	 */
	public void AjouterRoute(Route routeAAdd) {
		routes.add(routeAAdd);
	}

	
	/**
	 * Main :
	 */
	public static void main(String[] args) {
		CompagnieAutoroute compagnie = new CompagnieAutoroute();
		
	}

}
