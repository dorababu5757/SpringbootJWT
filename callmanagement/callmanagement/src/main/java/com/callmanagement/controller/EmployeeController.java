package com.callmanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.callmanagement.security.model.Employee;
import com.callmanagement.security.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/me")
	public Employee smple(HttpServletRequest httpServletRequest) {
		String name = httpServletRequest.getRemoteUser();
		return employeeRepository.findByUsername(name).get();
	}

}
