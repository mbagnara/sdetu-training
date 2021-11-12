package oop;

public class BankAccountApp {

	public static void main(String[] args) {

//		// Creating a new bank account
//		BankAccount acc1 = new BankAccount("Mario");
//		acc1.accountNumber = "122;34";
//		
//		BankAccount acc2 = new BankAccount("Savings Account");
//		acc2.accountNumber = "34567";		
//
//		BankAccount acc3 = new BankAccount("Mario","Checking Account", 1000);
//		acc3.accountNumber = "34567";	
//		acc3.checkBalance();
//		System.out.println(acc3.toString());
		
		
		// Extends a class
		CDaccount cd1 = new CDaccount();
		cd1.setAccountType("CD Account");
		cd1.setName("Katita");
		cd1.setAccountNumber("4576666");
		cd1.setBalance(20000);
		
		cd1.setRate();
		cd1.increaseRate();
				
		// Deposit
		cd1.deposit(100);
		cd1.deposit(120);
		cd1.deposit(135);
		
		// Withdraw
		cd1.withdraw(35);
		cd1.withdraw(22);
		System.out.println(cd1.toString());
				
	}

}
