package exceptionsfiles;

public class NegativePaymentException extends Exception {
	
	private double payment;
	
	// Constructor
	public NegativePaymentException(double payment) {
		 //System.out.println("ERROR: negative payment");
		this.payment = payment;
	}
	
	public String toString() {
		return "Error: cannot take a negative payment (" + this.payment + ")";
	}

}
