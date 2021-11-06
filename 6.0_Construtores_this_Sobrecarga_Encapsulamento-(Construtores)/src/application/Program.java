package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter product data");
	
	System.out.print("Name: ");
	String name = sc.nextLine();
			
	System.out.print("Price: ");
	double price = sc.nextDouble();
	
	System.out.print("Quantity in Stock: ");
	int quantity = sc.nextInt();
	
	
	// Com o uso do Construtor o usuario é obrigada a informar os dados do produto 
	// no momento da instanciacao, para nao deixar os dados vazios
	Product product = new Product(name, price, quantity);
	
	
	System.out.println();	
	System.out.println("Product data: " + product);
	
	System.out.println();
	System.out.print("Enter the number of products to be added in stock: ");
	quantity = sc.nextInt();   // quantidade a ser adicionada
	product.addProducts(quantity); // atualização dentro do objeto product
	
	System.out.println();
	System.out.println("Updated data: " + product);
	
	System.out.println();
	System.out.print("Enter the number of products to be remove in stock: ");
	quantity = sc.nextInt();
	product.removeProducts(quantity);
	
	System.out.println();
	System.out.println("Updated data: " + product);

	sc.close();
	}
}