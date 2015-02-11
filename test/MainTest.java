import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	@Test
	public void testDecompose() {
		assertTrue((Main.decompose("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"))[0].toString().equals("2H 3D 5S 9C KD"));
	}
	
	@Test
	public void testDecompose2() {
		System.out.println((Main.decompose("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"))[1].toString());
		assertTrue((Main.decompose("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"))[1].toString().equals("2C 3H 4S 8C AH"));
	}

}
