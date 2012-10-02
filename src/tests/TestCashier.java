package tests;

import classes.Cashier;
import classes.Envelope;
import junit.framework.TestCase;

public class TestCashier extends TestCase {
	Cashier cash;
	protected void setUp() throws Exception {
		Cashier cash = new Cashier();
	}

	public void testMakeChange() {
		Envelope customer = new Envelope(2, 3, 0, 0, 0);
		customer = cash.makeChange(customer, 2, 46);
		assertEquals(29, customer.getTotalCents());
	}

}
