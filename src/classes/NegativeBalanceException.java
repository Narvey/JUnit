package classes;

public class NegativeBalanceException extends Exception {
	public NegativeBalanceException() {
		super();
	}
	
	public NegativeBalanceException(String message) {
		super(message);
	}

	public NegativeBalanceException(Throwable cause) {
		super(cause);
	}

	public NegativeBalanceException(String message, Throwable cause) {
		super(message, cause);
	}

}
