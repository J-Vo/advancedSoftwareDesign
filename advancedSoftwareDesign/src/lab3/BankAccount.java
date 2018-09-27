package lab3;

public class BankAccount {

	private double balance;
	private String name;
	
	BankAccount(String name, double balance){
		this.setName(name);
		this.setBalance(balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void deposit(double amount) {
		
		double newBalance = this.getBalance();
		
		newBalance = amount + this.getBalance();
		
		this.setBalance(newBalance);
	}
	public void withdraw(double amount) {
		
		double newBalance = this.getBalance();
		
		newBalance = this.getBalance() - amount;
		
		this.setBalance(newBalance);
	}
	public void transfer(BankAccount otherAccount, double amount){
		if(this.getBalance() < amount || amount < 0) {
			throw new IllegalArgumentException("Not enough money to initiate transfer, or amount to transfer is invalid.");
		}
		this.withdraw(amount);
		
		otherAccount.deposit(amount);
	}
}
