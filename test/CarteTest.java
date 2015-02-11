import static org.junit.Assert.*;

import org.junit.Test;


public class CarteTest {

	@Test
	public void constructeurTest() {
		Carte c1 = new Carte("2C");
		assertEquals(c1.getFamille(), Famille.CLOVER);
		assertEquals(c1.getValeur(), 2);
	}

}
