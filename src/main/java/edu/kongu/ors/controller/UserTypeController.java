package edu.kongu.ors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.kongu.ors.model.UserType;
import edu.kongu.ors.service.UserTypeService;

@Controller
@RequestMapping("/usertypes")
public class UserTypeController {
	
	@Autowired
	private UserTypeService userTypeService;
	
	@GetMapping
	@ResponseBody
	public List<UserType> retrieveAllUserTypes() {
		return userTypeService.retrieveAll();
	}
	
	@PostMapping
	@ResponseBody
	public Integer create(@RequestParam(name = "type_name") String typeName) {
		return null;
	}
	
}
