import java.util.ArrayList;

public class AccountManager {

	/*
	 * Method validates data and creates an account
	 */
		public static void newAccount(ArrayList<Account> accounts) {

			System.out.print("Input account number: ");
			int accountNumber = ATM.unos.nextInt();
			while (accountNumber < 0 || doesAccountExist(accounts, accountNumber)) {
				if (accountNumber < 0) {
					System.out.print("The account number must be positive. Input again: ");
					accountNumber = ATM.unos.nextInt();
				} else if (doesAccountExist(accounts, accountNumber)) {
					System.out.print("The account number already exists. Input again: ");
					accountNumber = ATM.unos.nextInt();
				}
			}

			ATM.unos.nextLine();
			System.out.print("Input name: ");
			String accountOwner = ATM.unos.nextLine();

			System.out.print("Input an account balance: ");
			double accountBalance = ATM.unos.nextDouble();
			while (accountBalance < 0) {
				System.out.println("Iznos ne moze biti negativan!\nUnesite ponovo:");
				accountBalance = ATM.unos.nextDouble();
			}

			Account account = new Account(accountNumber, accountOwner, accountBalance);

			accounts.add(account);
		}

	/*
	 *  Method displays an account if it exists
	 */
	public static void displayAccount(ArrayList<Account> accounts, int accountNumber) {
		boolean account = false;
		for (int i = 0; i < accounts.size(); i++) {
			if (ATM.accounts.get(i).getAccountNumber() == accountNumber) {
				System.out.println("Owner: " + accounts.get(i).getAccountOwner());
				System.out.println("Balance: " + accounts.get(i).getAccountBalance());
				account = true;
				break;
			}
		}
		if (!account) {
			System.out.println("Account does not exists!");
		}
	}

	/*
	 * Method check does account exist
	 */
	public static boolean doesAccountExist(ArrayList<Account> accounts, int accountNumber) {

		boolean accountExists = false;

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				accountExists = true;
				break;
			} else {
				accountExists = false;
			}
		}
		return accountExists;
	}

	
}
