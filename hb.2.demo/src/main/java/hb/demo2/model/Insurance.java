package hb.demo2.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="insurance_details")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ins_type",discriminatorType = DiscriminatorType.STRING)
public class Insurance {
	
	@Id
	@Column(name="insured_id")
	private int id;
	
	@Column(name="insured_amt")
	private int sumInsured;
	
	@Column(name="insured_name")
	private String insured;
	
	public Insurance() {
		
	}
	
	public Insurance(int id,int sumInsured,String insured) {
		this.id=id;
		this.sumInsured=sumInsured;
		this.insured=insured;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

	public String getInsured() {
		return insured;
	}

	public void setInsured(String insured) {
		this.insured = insured;
	}
	
	

}
