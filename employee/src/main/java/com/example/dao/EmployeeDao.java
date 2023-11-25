package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.EmployeeEntity;
import com.example.repository.EmployeeRepository;

@Repository

public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	
	public String addEmployee(EmployeeEntity e) {
		empRepo.save(e);
		return "saved Successfully";
	}

}
