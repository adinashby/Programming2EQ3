
public class CheckingsAccount {
	public double balance;
	public double withdrawLimit;
	
	public void debit(double amount) {
		this.balance -= amount;
		System.out.println("The account was debitted");
	}
	
	public void credit(double amount) {
		this.balance += amount;
		System.out.println("The account was creditted");
	}
	
	public void withdraw(double amount) {
		if(amount < withdrawLimit) {
			this.balance -= amount;
			System.out.println("Cash was withdrawn from the account");
		} else {
			System.out.println("Balance not sufficient");
		}
	}
}
