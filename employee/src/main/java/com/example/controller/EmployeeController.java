package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmployeeEntity;
import com.example.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeService empser;
	@PostMapping(value="/addemp")
	public String addEmployee(@RequestBody EmployeeEntity e) {
		return empser.addEmployee(e);
	}

}
