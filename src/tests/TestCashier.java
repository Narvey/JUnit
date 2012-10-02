package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Cashier;
import classes.Envelope;
import classes.NegativeBalanceException;

public class TestCashier {
	@Test
	public void testMakeChange() throws NegativeBalanceException {
		Cashier cashier = new Cashier();
		
		Envelope paid = new Envelope(5,0,0,0,0);
		Envelope change = cashier.makeChange(paid, 1, 32);
		
		assertEquals(change.getTotalCents(), 5*100 - (1*100 + 32));
		assertEquals(change.getDollars(), 3);
		assertEquals(change.getQuarters(), 2);
		assertEquals(change.getDimes(), 1);
		assertEquals(change.getNickels(), 1);
		assertEquals(change.getPennies(), 3);
	}
	
	@Test (expected = NegativeBalanceException.class)
	public void testNegativeBalanceException() throws NegativeBalanceException {
		Cashier cashier = new Cashier();
		
		Envelope envelope = new Envelope(3, 5, 2, 4, 10);
		Envelope change = cashier.makeChange(envelope, 8, 3);
	}
	
	@Test
	public void testComplicatedChange() throws NegativeBalanceException {
		Cashier cashier = new Cashier();
		
		Envelope paid = new Envelope(0, 25, 2, 4, 2);
		Envelope change = cashier.makeChange(paid, 4, 38);
		assertEquals(change.getDollars(), 2);
		assertEquals(change.getQuarters(), 1);
		assertEquals(change.getDimes(), 0);
		assertEquals(change.getNickels(), 0);
		assertEquals(change.getPennies(), 4);
	}
}
