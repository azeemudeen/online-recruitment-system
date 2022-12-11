package edu.kongu.ors.data;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RegisterUserData {
	
	@NotEmpty(message = "Username must not be empty")
	private String username;
	
	@NotEmpty(message = "Password must not be empty")
	private String password;
	
	@NotEmpty(message = "User type must not be empty")
	private long userType;
	
}
