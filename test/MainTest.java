import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	@Test
	public void testDecompose() {
		System.out.println((Main.decompose("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"))[0].toString());
		assertTrue((Main.decompose("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"))[0].toString().equals("2H 3D 5S 9C KD"));
	}

}
