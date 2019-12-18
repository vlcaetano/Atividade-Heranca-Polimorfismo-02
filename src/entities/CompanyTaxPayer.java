package entities;

public class CompanyTaxPayer extends TaxPayers {

	private Integer numOfEmployees;
	
	public CompanyTaxPayer() {
		super();
	}

	public CompanyTaxPayer(String name, Double anualIncome, Integer numOfEmployees) {
		super(name, anualIncome);
		this.numOfEmployees = numOfEmployees;
	}

	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(Integer numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	@Override
	public Double taxValue() {
		if (numOfEmployees > 10) {
			return getAnualIncome() * .14;
		} else {
			return getAnualIncome() * .16;
		}
	}

	
}
