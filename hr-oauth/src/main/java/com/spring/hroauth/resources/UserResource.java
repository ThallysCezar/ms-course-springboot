package com.spring.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hroauth.entities.User;
import com.spring.hroauth.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserService service;

	@GetMapping(value = "search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		return ResponseEntity.ok(service.findByEmail(email));
	}
}
