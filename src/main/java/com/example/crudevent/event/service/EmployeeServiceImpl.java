package com.example.crudevent.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudevent.event.dto.EmployeeDto;
import com.example.crudevent.event.entity.Employee;
import com.example.crudevent.event.mapper.EmployeeMapper;
import com.example.crudevent.event.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	 public EmployeeDto createEmployee(EmployeeDto employeeDto) { 
		 Employee employee = EmployeeMapper.mapToEmployee(employeeDto); 
		 Employee createdEmployee = employeeRepository.save(employee); 
		 return EmployeeMapper.mapToEmployeeDto(createdEmployee); 
		 
	 }
	 
}
