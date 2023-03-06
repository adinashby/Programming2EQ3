import java.util.Arrays;

public class Client {
	public String name;
	public long SSN;
	public String address;
	public boolean employment;
	public AccountExample[] accounts;
	
	public Client(String name, long sSN, String address, boolean employment, AccountExample[] accounts) {
		this.name = name;
		SSN = sSN;
		this.address = address;
		this.employment = employment;
		this.accounts = accounts;
	}

	public void owns() {
		System.out.println(Arrays.toString(accounts));
	}
}
