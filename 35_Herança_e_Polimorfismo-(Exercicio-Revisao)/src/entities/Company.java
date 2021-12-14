package entities;

import javax.print.attribute.DateTimeSyntax;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	public void TaxPayer() {
	}
	
	public Company(String name, Double anuallIncome, Integer numberOfEmployees) {
		super(name, anuallIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double Impost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
