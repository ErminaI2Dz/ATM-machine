import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	
	public static Scanner unos = new Scanner(System.in);
	public static ArrayList<Account> accounts = new ArrayList<Account>();

	public static void main(String[] args) {
		
		int choice;

		Account account1 = new Account(1, "Malik", 2000.0);
		accounts.add(account1);

		Account account2 = new Account(2, "Harun", 200.0);
		accounts.add(account2);

		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Choose!\n");
			System.out.println("1 --> create account" + "\n2 --> transfer funds" + "\n3 --> account balance"
					+ "\n4 --> exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			choice = unos.nextInt();

			if (choice == 1) {
				AccountManager.newAccount(accounts);
				System.out.println("***********************");
				System.out.println("Racun uspjesno kreiran!");
				System.out.println("***********************");
			}

			if (choice == 2) {
				MoneyTransfer.transferAmount(accounts);
				System.out.println("*******************************");
				System.out.println("Transakcija uspjesno obavljena!");
				System.out.println("*******************************");
			}

			if (choice == 3) {
				System.out.print("Input account number:");
				int accountNumber = unos.nextInt();
				AccountManager.displayAccount(accounts, accountNumber);
			}
			if (choice == 4) {
				break;
			}

			System.out.println("\n");
		} while (choice != 0);

		unos.close();
	}
}
