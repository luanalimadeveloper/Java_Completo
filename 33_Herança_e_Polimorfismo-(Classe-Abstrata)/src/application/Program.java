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
		
		listProducts.add(new ImportProduct("TV", 550.00, 0.10));
		listProducts.add(new UsedProduct("Radio", 100.00, "25/12/2021"));
		listProducts.add(new ImportProduct("Computer", 1200.00, 0.20));
		listProducts.add(new UsedProduct("Mouse", 20.00, "01/01/2021"));

		double sum = 0.0;
		for( Product prod : listProducts) {
			sum += prod.getprice();
		}
		System.out.printf("Total Price: %.2f%n", sum);
		
		
		
		
		sc.close();
	}

}
