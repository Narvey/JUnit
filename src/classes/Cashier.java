package classes;

public class Cashier {
	public Envelope makeChange(Envelope paid, int dollars, int cents) throws NegativeBalanceException {
		
		int changePennies = paid.getTotalCents() - (dollars*100 + cents);
		
		if (changePennies < 0) {
			throw new NegativeBalanceException("Price exceeds envelope contents by " + -changePennies + " cents");
		}
		
		int changeDollars = changePennies/100;
		changePennies %= 100;
		int changeQuarters = changePennies/25;
		changePennies %= 25;
		int changeDimes = changePennies/10;
		changePennies %= 10;
		int changeNickels = changePennies/5;
		changePennies %= 5;
		
		return new Envelope(changeDollars, changeQuarters, changeDimes, changeNickels, changePennies);
	}
}
