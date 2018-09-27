package lab3;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	
	 SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.setInterestRate(interestRate);
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void computeInterest(){
		
		this.setBalance((this.getInterestRate() * this.getBalance()) + this.getBalance());
		
	}
	public static void main(String[] args) {
		
		SavingsAccount savings1 = new SavingsAccount("account1", 2000, .05);
		SavingsAccount savings2 = new SavingsAccount("account2", 200, .05);
		
		savings1.transfer(savings2, 500);
		
		System.out.println(savings1.getBalance());
		System.out.println(savings2.getBalance());
		
		savings1.computeInterest();
		savings2.computeInterest();
		
		System.out.println(savings1.getBalance());
		System.out.println(savings2.getBalance());
	}
}
