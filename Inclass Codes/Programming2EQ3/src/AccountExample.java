import java.util.Arrays;

public class AccountExample {
	public char type;
	public Client[] owners;
	public long accountNumber;
	public long routingNumber;
	public long wireRoutingNumber;
	public long bic;

	public AccountExample(char type, Client[] owners, long accountNumber, long routingNumber, long wireRoutingNumber,
			long bic) {
		this.type = type;
		this.owners = owners;
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		this.wireRoutingNumber = wireRoutingNumber;
		this.bic = bic;
	}

	@Override
	public String toString() {
		return "AccountExample [type=" + type + ", owners=" + Arrays.toString(owners) + ", accountNumber="
				+ accountNumber + ", routingNumber=" + routingNumber + ", wireRoutingNumber=" + wireRoutingNumber
				+ ", bic=" + bic + "]";
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public Client[] getOwners() {
		return owners;
	}

	public void setOwners(Client[] owners) {
		this.owners = owners;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(long routingNumber) {
		this.routingNumber = routingNumber;
	}

	public long getWireRoutingNumber() {
		return wireRoutingNumber;
	}

	public void setWireRoutingNumber(long wireRoutingNumber) {
		this.wireRoutingNumber = wireRoutingNumber;
	}

	public long getBic() {
		return bic;
	}

	public void setBic(long bic) {
		this.bic = bic;
	}

}
