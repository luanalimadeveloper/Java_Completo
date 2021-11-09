package entities;

public class Product {
	
	// Atributos
	public String name;
	public double price;
	public int quantity;
	
	// Metodos/ Operaçoes / Funçoes
	public double totalValueInStock() {
		return price * quantity;
	}
	
	// quantity - parametro / argumento que chegou no metodo
	public void addProducts (int quantity) {
		// this - relativo ao atributo da classe
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		// this - referencia para o objeto
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
