package application;

import java.util.Locale;
import java.util.Scanner;

import entiities.Account;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n) ? ");
		char anwser = sc.next().charAt(0);
		System.out.println("\n");
		
		if (anwser == 'y') {

			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			
			account = new Account(number, holder, value);
			
			System.out.println(account);
			
		} else {
			account = new Account(number, holder);
			System.out.println("Account data");
			System.out.println(account);
		}
		
		System.out.print("Enter a deposit value: ");
		double amountDeposit = sc.nextDouble();
		account.deposit(amountDeposit);
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double amountWithdraw = sc.nextDouble();
		account.withdraw(amountWithdraw);
		System.out.println(account);
		
		sc.close();
	}
}