package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Define variables
		double payment = 0;
		boolean positivePayment;
		
		// Asks until payment is negative
		do {
			
			// Start assuming the payment entered is negative
			positivePayment = true;
			
			// Ask the user for input		
			System.out.print("Enter the payment amount: ");
			
			// Get the amount and test the value
			Scanner in = new Scanner(System.in);
			
			// Handle the exception
			try {
				
				payment = in.nextDouble();
				
				if (payment < 0) {
					// Throw error
					throw new NegativePaymentException(payment);
				}
				
			} catch (NegativePaymentException e) {
				
				// Print out exception
				System.out.println(e.toString());
				
				// Setting the value to false forces while() to evaluate as negative and do another ask of the payment amount
				positivePayment = false;
			}
			
			System.out.println("Amount entered is " + payment + " and negativePayment is " + positivePayment);	
							
		} while(!positivePayment); 

		System.out.println("Thanks for your payment of $" + payment);	

	}

}
