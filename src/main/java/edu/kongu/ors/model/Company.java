package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "company")
@AllArgsConstructor @Getter
public class Company extends AbstractModel {
		
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "emp_range_id")
	private RangeEnum empRange;
	
	@Column(name = "email")	
	private String email;
	
	@Column(name = "contact_no")
	private String contactNo;

}
