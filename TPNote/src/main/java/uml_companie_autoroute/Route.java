package uml_companie_autoroute;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Route {
	final static Logger logger = LogManager.getLogger(Route.class);
	/**
	 * Attributs : portes
	 * Suivis de leurs getters / setters
	 */
	private List<Porte> portes;

	public List<Porte> getPortes() {
		return portes;
	}

	public void setPortes(List<Porte> portes) {
		this.portes = portes;
	}

	/**
	 * Constructeur: par defaut : initialisant les attributs
	 */
	public Route(){
		portes = new ArrayList<Porte>();
		logger.trace("Route créée");
	}
	
	
	/**
	 * toString - ok
	 */
	public String toString() {
		String listePortes="";
		for(Porte porte : portes) {
			listePortes += porte + ", ";
		}
		return "Les portes de cette routes sont : "+ listePortes;
	}
	
	
	/**
	 * addPorte - ok
	 */
	public void AddPorte(Porte newPorte) {
		portes.add(newPorte);
	}
	
	
	/**
	 * Main :
	 */
	public static void main(String[] args) {
		Route route = new Route();

	}

}
