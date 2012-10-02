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
		
		Envelope envelope = new Envelope(5,0,0,0,0);
		Envelope change = cashier.makeChange(envelope, 1, 32);
		
		assertEquals(change.getTotalCents(), 5*100 - (1*100 + 32));
		assertEquals(change.getDollars(), 3);
		assertEquals(change.getQuarters(), 2);
		assertEquals(change.getDimes(), 1);
		assertEquals(change.getNickels(), 1);
		assertEquals(change.getPennies(), 3);
	}
	public void secondTest(){
		Envelope customer = new Envelope(2, 3, 0, 0, 0);
		customer = cash.makeChange(customer, 2, 46);
		assertEquals(29, customer.getTotalCents());
	}
}

	
	@Test (expected = NegativeBalanceException.class)
	public void testNegativeBalanceException() throws NegativeBalanceException {
		Cashier cashier = new Cashier();
		
		Envelope envelope = new Envelope(3, 5, 2, 4, 10);
		Envelope change = cashier.makeChange(envelope, 8, 3);
	}
}
