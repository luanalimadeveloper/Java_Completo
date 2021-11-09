package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Construtor Padrao
	public Product(){
		
	}
	
	// Construtor Personalizado - Utlizado quando se quer criar um objeto e obrigatoriamente tem que passar o parametros
	public Product(String name, double price, int quantity) {
		//this - referencia ao atributo do objeto e não ao parametro
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
		
	}
	
	// SOBRECARGA - Disponibilizar mais de uma versao da mesma operaçao
	public Product(String name, double price) {	
		this.name = name;
		this.price = price;
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