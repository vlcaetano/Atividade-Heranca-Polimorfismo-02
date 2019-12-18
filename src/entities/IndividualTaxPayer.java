package entities;

public class IndividualTaxPayer extends TaxPayers {

	private Double healthExpend;
	
	public IndividualTaxPayer() {
		super();
	}
	
	public IndividualTaxPayer(String name, Double anualIncome, Double healthExpend) {
		super(name, anualIncome);
		this.healthExpend = healthExpend;
	}

	public Double getHealthExpend() {
		return healthExpend;
	}

	public void setHealthExpend(Double healthExpend) {
		this.healthExpend = healthExpend;
	}

	@Override
	public Double taxValue() {
		if (getAnualIncome() < 20000) {
			return getAnualIncome() * .15 - healthExpend * .5;
		} else {
			return getAnualIncome() * .25 - healthExpend * .5;
		}		
	}

}
