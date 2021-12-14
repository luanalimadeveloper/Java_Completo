package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public void Taxpayer() {
	}
	
	public Individual(String name, Double anuallIncome, Double healthExpenditures) {
		super(name, anuallIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double Impost() {
		return 0;
	}
	
	

}
