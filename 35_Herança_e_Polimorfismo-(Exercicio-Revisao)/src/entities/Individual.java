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
	public Double tax() {
		
		if (getAnuallIncome() < 20000.00 ) {
			return getAnuallIncome() * 0.15 - healthExpenditures * 0.5;
		}
		
		else {
			return getAnuallIncome() * 0.25 - healthExpenditures * 0.5;
		}
		
	}
	
	

}
