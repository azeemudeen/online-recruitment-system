package edu.kongu.ors.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kongu.ors.data.LoginUserData;
import edu.kongu.ors.data.RegisterUserData;
import edu.kongu.ors.data.ResponseData;
import edu.kongu.ors.model.User;
import edu.kongu.ors.model.UserType;
import edu.kongu.ors.repository.UserRepository;
import edu.kongu.ors.repository.UserTypeRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserTypeRepository userTypeRepository;
	
	public ResponseData checkCredentials(LoginUserData userData) {
		 User user =  userRepository.findByUsernameAndPassword(userData.getUsername(), userData.getPassword());
		 if(isNull(user)) {
			 System.out.println(user.getLastLogin());
			 return ResponseData.empty();
		 }
		 user.setLastLogin(LocalDateTime.now());
		 user = userRepository.save(user);
		 
		 return ResponseData.builder()
				.user(user)
				.build();
	}
	
	public ResponseData registerUser(RegisterUserData userData) {
		
		UserType userType = userTypeRepository.findById(userData.getUserType()).orElse(null);
		User newUser =  new User(userData.getUsername(), userData.getPassword(), userType);
		newUser = userRepository.save(newUser);
		
		return ResponseData.builder()
				.userId(newUser.getId())
				.build();
	}
	
	private boolean isNull(Object obj) {
		return obj == null ? true: false;
	}
}
