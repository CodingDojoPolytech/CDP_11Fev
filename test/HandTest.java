import static org.junit.Assert.*;

import org.junit.Test;


public class HandTest {

	@Test
	public void reconnaitreCombinaisonTest() {
		
	//	Hand h = new Hand("2D 2D 3C 3C 3C");
		
		Hand pair = new Hand();
		pair.ajouterCarte(new Carte("AS"));
		pair.ajouterCarte(new Carte("AC"));
		pair.ajouterCarte(new Carte("2S"));
		pair.ajouterCarte(new Carte("3S"));
		pair.ajouterCarte(new Carte("4S"));
		assertEquals(pair.reconnaitreCombinaison(), Combinaison.PAIR);
	}

}
