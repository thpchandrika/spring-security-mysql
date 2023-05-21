package com.chandrika.springsecurity.mysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApplicationController {

	@GetMapping("/process")
	public String process() {
		return "processing..";
	}
}
