package classes;

public class Envelope {
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	public Envelope() {
	}
	
	public Envelope(int dollars, int quarters, int dimes, int nickels, int pennies) {
		this.dollars = dollars;
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}
	
	public int getTotalCents() {
		return dollars*100 + quarters*25 + dimes*10 + nickels*5 + pennies;
	}
	
	//below this is just getters/setters.
	public int getDollars() {
		return dollars;
	}
	
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}
	
	public int getQuarters() {
		return quarters;
	}
	
	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}
	
	public int getDimes() {
		return dimes;
	}
	
	public void setDimes(int dimes) {
		this.dimes = dimes;
	}
	
	public int getNickels() {
		return nickels;
	}
	
	public void setNickels(int nickels) {
		this.nickels = nickels;
	}
	
	public int getPennies() {
		return pennies;
	}
	
	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
}
