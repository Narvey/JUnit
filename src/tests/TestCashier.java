package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Cashier;
import classes.Envelope;

public class TestCashier {

	@Test
	public void testMakeChange() {
		Cashier cashier = new Cashier();
		
		Envelope envelope = new Envelope(5,0,0,0,0);
		Envelope change = cashier.makeChange(envelope, 1, 32);
		
		assertEquals(change.getTotalCents(), 5*100 - (1*100 + 32));
		assertEquals(change.getDollars(), 3);
		assertEquals(change.getQuarters(), 2);
		assertEquals(change.getDimes(), 1);
		assertEquals(change.getNickels(), 1);
		assertEquals(change.getPennies(), 3);
	}
}
