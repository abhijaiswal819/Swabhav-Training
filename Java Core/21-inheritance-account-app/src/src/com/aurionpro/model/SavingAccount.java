package src.com.aurionpro.model;

public class SavingAccount extends Account {

	static final int MIN_BALANCE = 1000;

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	public SavingAccount(int accountNumber, String name) {
		super(accountNumber, name, 1000);
	}

	@Override
	public void withdraw(double amount) {
		if ((this.getBalance() - amount) > MIN_BALANCE) {
			this.setBalance(this.getBalance() - amount);
		}
	}
}