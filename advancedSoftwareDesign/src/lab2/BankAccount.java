package lab2;

public class BankAccount {
	
	private double balance;
	private int transactions = 0;
    private double AccountBonus = 100;
	
	public int getTransactions() {
		return transactions;
	}
	public void setTransactions() {
		this.transactions = this.transactions + 1;
	}
	public BankAccount(){
		this.balance = 0 + AccountBonus;
	}
	public BankAccount(double amount) {
		this.balance = amount + AccountBonus;
	}
	public void deposit(double amount){
		
		this.balance = this.balance + amount;
		
		this.setTransactions();
		
	}
	public void withdraw(double amount) {
		if(this.balance < 1000) {
			int charge = 1;
			this.balance = this.balance - charge;
		}
		this.balance = this.balance - amount;
		
		this.setTransactions();
	}
	public double getBalance(){
		return balance;
	}
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(2000);
		account1.withdraw(1000);
		account1.deposit(999);
		account1.withdraw(1000);
	   System.out.println(account1.getBalance());
	   System.out.println(account1.getTransactions());
	   account1.withdraw(99);
	   System.out.println(account1.getBalance());
	   System.out.println(account1.getTransactions());
	}
	
	
}
