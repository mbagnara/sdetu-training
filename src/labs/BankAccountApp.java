package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount("713569087", 1500);
		acc1.setName("Mario");
		acc1.makeDeposit(100);
		acc1.makeDeposit(150);
		acc1.payBill(80);
		acc1.accrue();
		System.out.println(acc1.toString());		
		
	}

}

class BankAccount implements IInterest {

	// Properties of bank account
	private static int iD = 1001;								// Internal ID
	private static final String routingNumber = "0054254";
	private String AccountNumber; 								// ID + random 2-digit number + first 2 of SSN	
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initialDeposit) {
		System.out.println("New account created, ID: " + iD);	
		this.SSN = SSN;
		this.balance = initialDeposit;
		setAccountNumber();
		iD++;
		showBalance();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		AccountNumber = iD + "-" + random + "-" + this.SSN.substring(0, 2);
		System.out.println("Your account number is :" + AccountNumber);
		
//		for (int i = 0; i < 20; i++) {
//			random = Math.random();
//			System.out.println(random + " " + (int) (random * 10));
//		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying bill of $ " + amount);
		this.balance -= amount;
		showBalance();		
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit of $ " + amount);
		this.balance += amount;
		showBalance();
		
	}
	
	public void showBalance() {
		System.out.println("The current balance is $ " + this.balance);
	}
	
	public void accruedInterest() {
		
	}

	@Override
	public void accrue() {
		balance *= (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + this.name + "]\n[Account Number: " +  this.AccountNumber + "]\n[Routing Number: " + this.routingNumber + "]\n[Balance: " + this.balance + "]\n"; 
						
	}
}
