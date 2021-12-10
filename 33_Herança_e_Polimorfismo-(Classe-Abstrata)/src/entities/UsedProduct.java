package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	public String ManufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, String string) {
		super(name, price);
		ManufactureDate = string;
	}

	public String getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
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
