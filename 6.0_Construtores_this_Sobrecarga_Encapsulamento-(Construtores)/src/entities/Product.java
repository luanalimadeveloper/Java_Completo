package entities;

public class Product {
	// Atributos
	private String name;
	private double price;
	private int quantity;
	
	// Construtor
	public Product(String name, double price, int quantity) {
		//this - referencia ao atributo do objeto e não ao parametro
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
		
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}