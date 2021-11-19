package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date timeNow = new Date();
		
		System.out.println("----- Enter client data -----");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		
		
		System.out.println("----- Enter order data -----");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order? ");
		int quantityOrder = sc.nextInt();
	
		
		Order order = new Order(timeNow, OrderStatus.valueOf(status), new Client(name, email, birthdate));
		
		for (int i = 1; i<= quantityOrder; i++) {
			System.out.println(" -- Enter #" + i + " item data");
			System.out.print("Product name: ");
			String product = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, new Product(product, price));
			
			order.addItem(orderItem);
		}
		
		System.out.println(order);
		
		
		
		sc.close();
	}

}
