import java.util.Arrays;

public class AccountTest {

	public static void main(String[] args) {
//		Account account = new Account();
//		Account[] accounts = { new Account(), new Account(1242, "Adin", 20), new Account(4212, "John", 4332) };
//
//		Account[] accounts = new Account[3];    // { null, null, null }
//		Arrays.fill(accounts, new Account());

		Account[] accounts;

		Account account1 = new Account();
		Account account2 = new Account(1242, "Adin", 20);
		Account account3 = new Account(4212, "John", 4332);

		accounts = new Account[] { account1, account2, account3 };

		System.out.println(accounts[0]);
		System.out.println();

		for(Account account : accounts) {
		    account.increaseInterestRate();
		    //System.out.println(account);
		}
		

//		for(Account account : accounts) {
//		    System.out.println(account);
//		    System.out.println();
//		}

		for(int i = 0; i < accounts.length; i++) {
		    accounts[i].increaseInterestRate();
		}
		
		for(Account account : accounts) {
		    System.out.println(account);
		    System.out.println();
		}
		
	}
}
