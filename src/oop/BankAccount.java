package oop;

public class BankAccount implements IRate {
	// Define variables

	/*
	 * static makes routingNumber to be shared across all instances of the class
	 * When using final you will not be able to change the value of routingNumber  
	 */
	private static final String routingNumber = "0145378900";

	private String name;
	private String accountNumber;
	private String ssn;
	private String accountType;
	private double balance = 0;

	// Constructor definition: unique methods	
	BankAccount(){
		System.out.println("New account created");
	}

	BankAccount(String name, String accountType, double initialDeposit) {
		this.name = name;
		this.accountType = accountType;
		this.balance = initialDeposit;
	}

	// Overloading	
	BankAccount(String accountType){
		System.out.println("New Account :" + accountType);
	}

	BankAccount(String accountType, double initialDeposit)  {
		System.out.println("Account Type: " + accountType + " Initial Deposit: " + initialDeposit);
		balance += initialDeposit;
	}

	// Getters and Setters
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {		
		return this.name;		
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountNumber( ) {
		return this.accountNumber;
	}

	// Define methods
	void deposit(double amount) {
		balance += amount;
		showActivity("Deposit of $ " + amount);
	}

	void withdraw(double amount) {
		balance -= amount;
		showActivity("Withdraw of $ " + amount);
	}

	private void showActivity(String activity) {
		System.out.println("Recent Transaction: " + activity + " Your New balance is $ " + balance);
	}

	void checkBalance() {
		System.out.println("Your current balance is $ " + this.balance);		
	}

	void getStatus() {
	}

	@Override
	public String toString() {
		return "/Name : " + this.name + " /Account Number: " + this.accountNumber + " /Routing Number :" + this.routingNumber + " /Current Balance: " + this.balance;
	}

	// Interfacce mnethods
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Setting rate");
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increasing rate");
	} 
}
