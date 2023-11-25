package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.entity.EmployeeEntity;

@Service

public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	
	public String addEmployee(EmployeeEntity e) {
		return empDao.addEmployee(e);
	}
	
	

}
