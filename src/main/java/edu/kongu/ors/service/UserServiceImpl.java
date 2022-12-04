package edu.kongu.ors.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.kongu.ors.model.User;
import edu.kongu.ors.model.UserType;
import edu.kongu.ors.repository.UserRepository;
import edu.kongu.ors.repository.UserTypeRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	private UserTypeRepository userTypeRepository;

	@Override
	public List<User> retrieveAll() {
		return userRepository.findAll();
	}

	@Override
	public Long create(String username, String password, Long userTypeId) {
		UserType userType = userTypeRepository.findById(userTypeId).orElse(null);
		User user = new User(username, password, userType, true, LocalDateTime.now(), LocalDateTime.now());
		user = userRepository.save(user);
		return user.getId();
	}

}
