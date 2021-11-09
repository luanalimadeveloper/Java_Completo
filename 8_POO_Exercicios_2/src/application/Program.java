package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee data = new Employee();
		
		System.out.println("name: ");
		data.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		data.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		data.tax = sc.nextDouble();
		 
		System.out.printf("Employee: " + data);
		
		System.out.println();
		System.out.println("Which percentage to increase salary ? ");
		double percentage= sc.nextDouble();
		data.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + data);
		
		sc.close();
	}

}