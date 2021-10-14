package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
	}
	
	public Integer getNumbOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumbOfEmployees(Integer numbOfEmployees) {
		this.numberOfEmployees = numbOfEmployees;
	}

	public Company(String name, Double anualIcome, Integer numbOfEmployees) {
		super(name, anualIcome);
		this.numberOfEmployees = numbOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnualIcome() * 0.14;
		}
		else {
			return getAnualIcome() * 0.16;
		}
	}
}
