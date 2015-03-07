import static org.junit.Assert.*;

import org.junit.Test;

public class ConversioneTest {

	Convertitore convertitore = new Convertitore();

	/* test per le cifre singole */
	@Test
	public void testUno() {

		assertEquals("1", convertitore.converti("I"));
	}

	@Test
	public void testCinque() {

		assertEquals("5", convertitore.converti("V"));
	}

	@Test
	public void testDieci() {

		assertEquals("10", convertitore.converti("X"));
	}

	@Test
	public void testCinquanta() {

		assertEquals("50", convertitore.converti("L"));
	}

	@Test
	public void testCento() {

		assertEquals("100", convertitore.converti("C"));
	}

	@Test
	public void testMille() {

		assertEquals("1000", convertitore.converti("M"));
	}

	/* test per le cifre uguali */
	@Test
	public void testTre() {

		assertEquals("3", convertitore.converti("III"));
	}

	public void testTrenta() {

		assertEquals("30", convertitore.converti("XXX"));
	}

	public void testTrecento() {

		assertEquals("300", convertitore.converti("CCC"));
	}

	public void testTremila() {

		assertEquals("3000", convertitore.converti("MMM"));
	}

	/* test per le cifre diverse */
	@Test
	public void testQuattro() {

		assertEquals("4", convertitore.converti("IV"));
	}

	@Test
	public void testSei() {

		assertEquals("6", convertitore.converti("VI"));
	}

	/* test con minuscole */
	@Test
	public void testSoloMinuscole() {
		assertEquals("999", convertitore.converti("cmxcix"));
	}

	@Test
	public void testMinuscoleEMaiuscole() {
		assertEquals("999", convertitore.converti("CmXcIx"));
	}

}
