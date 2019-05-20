
public class Account {

	private int accountNumber;
	private String accountOwner;
	private Double accountBalance;

	Account() {

	}

	Account(int accountNumber, String accountOwner, Double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountOwner=" + accountOwner + ", accountBalance="
				+ accountBalance + "]";
	}

	
	
	

}
