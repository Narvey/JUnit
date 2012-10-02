package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import classes.Envelope;

public class TestEnvelope {
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
	public void testEnvelopeParams() {
		Envelope param = new Envelope(1,2,3,4,5);
		assertEquals(1, param.getDollars());
		assertEquals(2, param.getQuarters());
		assertEquals(3, param.getDimes());
		assertEquals(4, param.getNickels());
		assertEquals(5, param.getPennies());
	}
}

