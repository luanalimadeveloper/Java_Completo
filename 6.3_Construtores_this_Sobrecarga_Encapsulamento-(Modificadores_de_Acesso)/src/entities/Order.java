package entities;

import java.sql.Date;

public class Order {
	
	private Date date;
	private Product product;
	
	public Order(Date date, Product product) {
		this.date = date;
		this.product = product;
		
		// Order esta no mesmo pacote entao ela pode acessar o name de um atributo (se o modificador de acesso estiver omitido).
		this.product.name = "TV"; 
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
