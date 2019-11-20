package com.company.repository;

import org.springframework.data.repository.CrudRepository;

import com.company.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {}