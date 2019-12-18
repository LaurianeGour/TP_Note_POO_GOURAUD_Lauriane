package testJUnit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


import uml_companie_autoroute.OrdrePorteComparator;
import uml_companie_autoroute.Porte;
import uml_companie_autoroute.PorteEntree;
import uml_companie_autoroute.PorteSortie;

public class OrdrePorteComparatorTest {
	private static List<Porte> list = new ArrayList<Porte>();;

	@BeforeClass
	public static void initTests() {
		Porte p1 = new PorteEntree(1), p2 = new PorteSortie(2), p3 = new PorteEntree(3), p4 = new PorteSortie(4);

		list.add(p4);
		list.add(p3);
		list.add(p1);
		list.add(p2);
		
		Collections.sort(list, new OrdrePorteComparator());
	}

	@Test
	public void testCompare() {
		assertEquals("Vérification des items de la liste", 1, list.get(0).getNumeroDePorte());
		assertEquals("Vérification des items de la liste", 2, list.get(1).getNumeroDePorte());
		assertEquals("Vérification des items de la liste", 3, list.get(2).getNumeroDePorte());
		assertEquals("Vérification des items de la liste", 4, list.get(3).getNumeroDePorte());
	}

}
