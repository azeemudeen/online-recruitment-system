package edu.kongu.ors.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class User extends AbstractModel{

	@Column(name = "username", unique = true)
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;
	
	@Column(name = "is_active")
	private boolean isActive;

	@Setter
	@Column(name = "last_login")
	private LocalDateTime lastLogin;

	@Column(name = "create_date")
	private LocalDateTime createDate;
	
	public User(String username, String password, UserType userType){
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.isActive = true;
		this.lastLogin = LocalDateTime.now();
		this.createDate = LocalDateTime.now();
	}
	
	public LocalDate getCreateDate() {
		return this.createDate.toLocalDate();
	}
	
}
