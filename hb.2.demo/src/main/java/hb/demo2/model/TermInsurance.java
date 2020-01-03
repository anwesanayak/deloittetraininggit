package hb.demo2.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="T_I")
public class TermInsurance extends Insurance {

	@Column(name = "insured_years")
	private int years;
	
	public TermInsurance() {
		
	}
	
	public TermInsurance(int years) {
		this.years=years;
		
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	
}
