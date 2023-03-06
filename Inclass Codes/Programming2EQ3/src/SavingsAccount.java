
public class SavingsAccount {
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
}
