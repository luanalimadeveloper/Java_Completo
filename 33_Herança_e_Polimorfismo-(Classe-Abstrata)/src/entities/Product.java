package entities;

public abstract class Product {
	
	protected String name;
	protected Double price;
	
	public Product(){
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getprice() {
		return price;
	}

	public void setprice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name + " $ " + price;
	}
	
	
	
	
	
}
