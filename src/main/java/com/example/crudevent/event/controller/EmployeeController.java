package com.example.crudevent.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudevent.event.dto.EmployeeDto;
import com.example.crudevent.event.service.EmployeeServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeController {	

	@Autowired
	private EmployeeServiceImpl employeeService;

	@PostMapping(value = "/employee")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
		EmployeeDto createdEmployee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
	}	
	
	
}
