package classes;

public class NegativeBalanceException extends Exception {

	public NegativeBalanceException() {
	}//not sure if this is needed.

	public NegativeBalanceException(String message) {
		super(message);
	}

	public NegativeBalanceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NegativeBalanceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
