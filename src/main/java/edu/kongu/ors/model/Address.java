package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "address")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class Address extends AbstractModel{
	
	@Column(name = "address_1")
	private String addressLine1;
	
	@Column(name = "address_2")
	private String addressLine2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zipcode")
	private int zipcode;
}
