package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Currency;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.next();
		System.out.println("Is there a initial deposit value?(y/n)");
		char response = sc.next().charAt(0);
		Currency currency;
		
		if (response == 'y') {
			System.out.println("Enter a initial deposit:");
			double initialDeposit = sc.nextDouble();
			currency = new Currency(number, holder, initialDeposit);
		} else {
			currency = new Currency(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(currency);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		currency.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(currency);

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		currency.withdraw(withdrawValue);
		System.out.println(currency);
		sc.close();

	}

}
