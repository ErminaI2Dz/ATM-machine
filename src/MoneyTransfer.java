import java.util.ArrayList;

public class MoneyTransfer {

	/*
	 *  This method transfers money from one account to another
	 */
	public static void transferAmount(ArrayList<Account> accounts) {

		double account1Balance = -9, transferAmount, newAccount1Balance, newAccount2Balance;
		int accountNumber1, accountNumber2;

		System.out.println("Input account number from which You are transfering funds:");
		accountNumber1 = ATM.unos.nextInt();
		while (!AccountManager.doesAccountExist(accounts, accountNumber1)) {
			System.out.println("The account number does not exist. Input again: ");
			accountNumber1 = ATM.unos.nextInt();
		}
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber1) {
				account1Balance = accounts.get(i).getAccountBalance();
			}
		}
		System.out.println("\nInput account number to which You are transfering funds: ");
		accountNumber2 = ATM.unos.nextInt();
		while (!AccountManager.doesAccountExist(accounts, accountNumber2) || accountNumber1 == accountNumber2) {
			while (!AccountManager.doesAccountExist(accounts, accountNumber2)) {
				System.out.println("The account number already exists. Input again: ");
				accountNumber2 = ATM.unos.nextInt();
			}
			while (accountNumber1 == accountNumber2) {
				System.out.println(
						"Accounts numbers are the same!\nInput account number to which You are transfering funds again: ");
				accountNumber2 = ATM.unos.nextInt();
			}
		}

		System.out.println("\nInput the amount of funds You want to transfer: ");
		transferAmount = ATM.unos.nextDouble();
		while (transferAmount <= 0 || transferAmount <= 0) {
			while (transferAmount <= 0) {
				System.out.println("Transfer amount must be higher than 0!\nInput again: ");
				transferAmount = ATM.unos.nextDouble();
			}
			while (transferAmount > account1Balance) {
				System.out.println(
						"Not enough funds for transfer!\nInput the amount of funds You want to transfer: ");
				transferAmount = ATM.unos.nextDouble();
			}
		}

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber1) {
				newAccount1Balance = accounts.get(i).getAccountBalance() - transferAmount;

				accounts.get(i).setAccountBalance(newAccount1Balance);
			}
			if (accounts.get(i).getAccountNumber() == accountNumber2) {

				newAccount2Balance = accounts.get(i).getAccountBalance() + transferAmount;
				accounts.get(i).setAccountBalance(newAccount2Balance);
			}

		}

	}
}
