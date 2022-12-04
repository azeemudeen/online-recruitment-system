package edu.kongu.ors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.kongu.ors.model.User;
import edu.kongu.ors.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	@ResponseBody
	public List<User> retrieveAllUser(){
		return userService.retrieveAll();
	}
	
	@PostMapping
	@ResponseBody
	public Long create(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password,
			@RequestParam(name = "userType") Long userTypeId){
		return userService.create(username, password, userTypeId);
	}
}
