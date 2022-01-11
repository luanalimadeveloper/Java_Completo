package project;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import services.OnlinePaymentsService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		System.out.println("Date (dd/mm/yyyy): ");
		
		
		
		
		sc.close();
	}

}
