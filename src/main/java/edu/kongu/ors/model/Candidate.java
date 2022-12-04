package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "candidate")
@AllArgsConstructor @Getter
public class Candidate extends AbstractModel{
		
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="display_name")
	private String displayName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_no")
	private String contactNo;
}
