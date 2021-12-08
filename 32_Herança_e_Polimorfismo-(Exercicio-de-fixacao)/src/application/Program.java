package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Product product;
		
		List <Product> listProducts = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		for (int i = 0; i < numberProducts; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i) ? ");
			char typeProduct = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (typeProduct == 'i') {
				System.out.print("Cunstoms fee:");
				Double fee = sc.nextDouble();
				ImportProduct ImportProduct = new ImportProduct(name, price, fee);
				listProducts.add(ImportProduct);
			}
			
			else if (typeProduct == 'u') {
				System.out.print("Manufacture Date: ");
				Date date = sdf.parse(sc.next());
				UsedProduct  usedProduct = new UsedProduct(name, price, date);
				listProducts.add(usedProduct);
			}
			
			else {
				listProducts.add(new Product(name, price));
			}
	
		}
		System.out.println("Price Tags");
		
		for (Product prod : listProducts) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}

}
