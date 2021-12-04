package entities;

import java.util.Date;

public class UsedProduct extends Product{
	
	public Date ManufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() + 
				" (used) $ " + 
				String.format("%.2f", getprice())  + 
				" (Manufacture date: " + 
				ManufactureDate +
				")";
	}
	
	
}
