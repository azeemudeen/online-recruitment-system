package edu.kongu.ors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.kongu.ors.data.LoginUserData;
import edu.kongu.ors.data.RegisterUserData;
import edu.kongu.ors.data.ResponseData;
import edu.kongu.ors.service.AuthService;

@Controller
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/login")
	public ResponseEntity<ResponseData> login(@RequestBody LoginUserData userData){
		ResponseData responseData = authService.checkCredentials(userData);
		if(isNotNull(responseData)) {
			return new ResponseEntity<ResponseData>(responseData,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	}
	
	@PostMapping("/register")
	public ResponseEntity<ResponseData> register(@RequestBody RegisterUserData userData){
		ResponseData responseData = authService.registerUser(userData);
		if(isNotNull(responseData)) {
			return new ResponseEntity<ResponseData>(responseData,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	}
	
	private boolean isNotNull(Object obj) {
		return obj != null ? true: false;
	}

}
