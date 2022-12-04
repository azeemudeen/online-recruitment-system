package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "recruiter")
@NoArgsConstructor @AllArgsConstructor
@Getter @ToString
public class Recruiter extends AbstractModel{
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "dob")
	private String DOB;
	
	@Column(name = "age")
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	
}
