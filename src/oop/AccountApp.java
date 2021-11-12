package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmortizationSchedule();
		la.setTerm(20);

		// Polymorphism using an Interface, where LoanAccount() implements IRate
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}

}
