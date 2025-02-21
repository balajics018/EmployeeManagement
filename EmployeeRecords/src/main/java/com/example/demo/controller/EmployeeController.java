package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;


	@RestController
	@RequestMapping("/api/employees")
	public class EmployeeController {
	    @Autowired
	    private EmployeeService employeeService;

	    @PostMapping
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeService.createEmployee(employee);
	    }

	    @GetMapping
	    public List<Employee> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    @GetMapping("/{id}")
	    public Employee getEmployeeById(@PathVariable Long id) {
	        return employeeService.getEmployeeById(id);
	    }

	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
	        return employeeService.updateEmployee(id, employee);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	        return "Employee deleted successfully";
	    }
	}

