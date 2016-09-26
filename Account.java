public class Account {
	
   private int accountNumber;
	private double balance;

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void deposit(int amount) {
		this.balance = balance + amount;
	}

	public void withdraw(int amount) {
		this.balance = balance - amount;
	}

	public double checkBallance() {
		return this.balance;
	}
}