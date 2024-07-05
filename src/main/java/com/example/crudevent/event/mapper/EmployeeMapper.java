package com.example.crudevent.event.mapper;

import com.example.crudevent.event.dto.EmployeeDto;
import com.example.crudevent.event.entity.Employee;

public class EmployeeMapper {

	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return new EmployeeDto(employee.getId(), employee.getName(), employee.getDepartment());
	}

	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		return new Employee(employeeDto.getId(), employeeDto.getName(), employeeDto.getDepartment());
	}

}
