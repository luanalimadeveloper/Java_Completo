package application;

import java.lang.Character.UnicodeScript;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Company;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> listTaxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = sc.nextInt();
		
		for (int i = 0; i < numberOfTaxPayers ; i++) {
			System.out.print("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char typeTaxPayer = sc.next().charAt(0);
			
			if (typeTaxPayer == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				double anullIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				listTaxPayer.add(new Individual(name, anullIncome, healthExpenditures));
			}
			else {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				double anullIncome = sc.nextDouble();
				System.out.print("Number of Employees: ");
				int numberOfEmployees = sc.nextInt();
				
				listTaxPayer.add(new Company(name, anullIncome, numberOfEmployees));
			}
			
		}
	
		double totalTaxes = 0;
		System.out.println("");
		for (TaxPayer payer : listTaxPayer) {
			totalTaxes += payer.tax();
			System.out.println("TAXES PAID: ");
			System.out.println(payer.getName() + " : $ " + payer.tax());
		}
		
		System.out.println("");
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		
		sc.close();
	}

}
