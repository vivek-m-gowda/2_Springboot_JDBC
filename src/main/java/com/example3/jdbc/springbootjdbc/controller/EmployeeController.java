package com.example3.jdbc.springbootjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example3.jdbc.springbootjdbc.model.Employee;
import com.example3.jdbc.springbootjdbc.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeRepository.getAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeRepository.getById(id);
	}
	
	@PostMapping("/employees/save")
	public String saveEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee)+ " Number of rows saved to the database";
	}
	
	@PutMapping("/employees/update/{id}")
	public String updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		return employeeRepository.update(employee, id)+ " Number of rows updated to the database";
	}
	
	@DeleteMapping("employees/delete/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return employeeRepository.delete(id)+ " Number of rows deleted from the database";
	}
}
