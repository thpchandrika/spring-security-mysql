package com.chandrika.springsecurity.mysql.controller;

import com.chandrika.springsecurity.mysql.model.User;
import com.chandrika.springsecurity.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping("/add")
	public String addUserByAdmin(@RequestBody User user) {
		String pwd = user.getPassword();
		String encryptPwd = passwordEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		userRepository.save(user);
		return "user added successfully...";
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/hello")
	public String securedHello() {
		return "Secured Hello";
	}

}
