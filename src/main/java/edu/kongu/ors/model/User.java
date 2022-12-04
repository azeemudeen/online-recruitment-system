package edu.kongu.ors.model;

import java.time.LocalDateTime;

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
@Table(name = "user")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class User extends AbstractModel{

	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;
	
	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "last_login")
	private LocalDateTime lastLogin;

	@Column(name = "create_date")
	private LocalDateTime creatDate;
	

}
