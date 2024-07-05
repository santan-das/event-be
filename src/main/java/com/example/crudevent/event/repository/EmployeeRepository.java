package com.example.crudevent.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudevent.event.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
