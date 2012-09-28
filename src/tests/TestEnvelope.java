package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Envelope;

public class TestEnvelope {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetTotalCents() {
		Envelope test = new Envelope();
		assertEquals(0, test.getTotalCents());
		Envelope test2 = new Envelope();
		test2.setDimes(2);
		test2.setDollars(2);
		test2.setQuarters(1);
		test2.setNickels(2);
		test2.setPennies(3);
		assertEquals(258, test2.getTotalCents());
	}

	@Test
	public void testEnvelope() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnvelopeIntIntIntIntInt() {
		fail("Not yet implemented");
	}

}
