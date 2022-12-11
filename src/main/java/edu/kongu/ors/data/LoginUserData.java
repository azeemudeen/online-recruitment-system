package edu.kongu.ors.data;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class LoginUserData {
	
	@NotEmpty(message = "Username must not empty")
	private String username;
	
	@NotEmpty(message = "Password must not empty")
	private String password;
	
}
