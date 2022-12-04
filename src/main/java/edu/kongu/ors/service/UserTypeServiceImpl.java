package edu.kongu.ors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kongu.ors.model.UserType;
import edu.kongu.ors.repository.UserTypeRepository;

@Service
public class UserTypeServiceImpl implements UserTypeService {

	public UserTypeRepository userTypeRepository;
	
	@Autowired
	public UserTypeServiceImpl(UserTypeRepository userTypeRepository) {
		this.userTypeRepository = userTypeRepository;
	}

	@Override
	public List<UserType> retrieveAll() {
		return userTypeRepository.findAll();
	}

}
