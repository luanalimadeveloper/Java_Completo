package entities;

public  abstract class TaxPayer {

	private String name;
	private Double anuallIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anuallIncome) {
		this.name = name;
		this.anuallIncome = anuallIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallIncome() {
		return anuallIncome;
	}

	public void setAnuallIncome(Double anuallIncome) {
		this.anuallIncome = anuallIncome;
	}
	
	// abstract because is very generic 
	public abstract double Impost();
	
}
