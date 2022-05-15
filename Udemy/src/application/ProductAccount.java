package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProductAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account number:");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		
		String name = sc.nextLine();
		
		
		Account account = new Account(name, accountNumber);
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value:");
			double value = sc.nextDouble();
			account.deposit(value);
		} 
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value:");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
