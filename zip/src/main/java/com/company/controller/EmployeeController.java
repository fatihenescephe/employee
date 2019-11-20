package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.company.model.Employee;



import com.company.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    
    
    
    @GetMapping("/employees")
    private List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
   
    
    @GetMapping("/employees/{id}")
    private Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employees/{id}")
    private void deleteEmployee(@PathVariable("id") int id) {
        employeeService.delete(id);
    }

    @PostMapping("/employees")
    private int saveEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
        return employee.getId();
    }
  
}