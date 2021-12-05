package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		for (int i = 0; i < numberProducts; i++) {
			System.out.println("Product #" + i+1 + " data:");
			System.out.print("Common, used or imported (c/u/i) ? ");
			char typeProduct = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();
			System.out.println("Price");
			Double price = sc.nextDouble();
			
			if (typeProduct == i) {
				System.out.println("Cunstoms fee");
			}
			
		}

	}

}
