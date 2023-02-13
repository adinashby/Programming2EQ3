/**
 *
 * @author adinashby
 */
public class Account {

    private int accountNumber;
    private String name;
    private double amount;
    private double interestRate = 2.5;

    public Account(){

    }

    public Account(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public void increaseInterestRate() {
        interestRate += 0.5;
    }

    public String toString() {
        return "AccountNumber: " + accountNumber
                + "\nname: " + name
                + "\namount: " + amount
                + "\ninterestRate: " + interestRate;
    }
}
