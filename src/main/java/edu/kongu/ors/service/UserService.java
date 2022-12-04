package edu.kongu.ors.service;

import java.util.List;
import edu.kongu.ors.model.User;

public interface UserService {
	public Long create(String username,String password, Long userTypeId);
	public List<User> retrieveAll();
}
