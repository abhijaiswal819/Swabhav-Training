package src.com.aurionpro.model;
public class CurrentAccount extends Account {

	static final int OVER_DRAFT_LIMIT = -20000;

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	public CurrentAccount(int accountNumber, String name) {
		super(accountNumber, name, 1000);
	}

	@Override
	public void withdraw(double amount) {
		if ((this.getBalance() - amount) > OVER_DRAFT_LIMIT) {
			this.setBalance(this.getBalance() - amount);
		}
	}
}