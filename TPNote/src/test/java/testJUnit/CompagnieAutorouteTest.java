package testJUnit;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Collections;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import uml_companie_autoroute.*;

public class CompagnieAutorouteTest {
	public static CompagnieAutoroute compagnieAutoroute;
	public static Route r1, r2;
	
	@BeforeClass
	public static void initTests() {
		compagnieAutoroute = new CompagnieAutoroute();
		r1 = new Route();
		r2 = new Route();
		
	}
	
	@Test
    public void testObtenirTarifExacte() {

        Porte pA = new PorteEntree(10), pB = new PorteSortie(20), pC = new PorteSortie(30), pD = new PorteSortie(40);


        r1.AddPorte(pA);
        r1.AddPorte(pB);
        r1.AddPorte(pC);
        r1.AddPorte(pD);

        compagnieAutoroute.AjouterRoute(r1);

        Tarif tABCD = new Tarif(pA, pD, new BigDecimal("1.23E+3"));


        compagnieAutoroute.AjouterTarif(tABCD);

        assertEquals("Erreur calcul exacte du tarif", new BigDecimal("1.23E+3"), compagnieAutoroute.ObtenirTarif(pA, pD));
    }

    @Test
    public void testObtenirTarifCalculé() {	//Failure à l'execution

        Porte p1 = new PorteEntree(1), p2 = new PorteSortie(2), p3 = new PorteEntree(3), p4 = new PorteSortie(4);

        r2.AddPorte(p4);
        r2.AddPorte(p3);
        r2.AddPorte(p1);
        r2.AddPorte(p2);

        compagnieAutoroute.AjouterRoute(r2);
        Collections.sort(r1.getPortes(), new OrdrePorteComparator());

        Tarif
                t12 = new Tarif(p1, p2, new BigDecimal("1E+1")),
                t23 = new Tarif(p2, p3, new BigDecimal("2E+1")),
                t34 = new Tarif(p3, p4, new BigDecimal("3E+1"));

        compagnieAutoroute.AjouterTarif(t12);
        compagnieAutoroute.AjouterTarif(t23);
        compagnieAutoroute.AjouterTarif(t34);

        assertEquals("Erreur calcul du tarif", new BigDecimal("60"), compagnieAutoroute.ObtenirTarif(p1, p4));
    }

}
