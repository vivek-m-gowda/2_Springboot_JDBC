package com.example3.jdbc.springbootjdbc.repository;

import java.util.List;

import com.example3.jdbc.springbootjdbc.model.Employee;

public interface EmployeeRepository {
	
	int save(Employee employee);
	
	int update(Employee employee, int id);
	
	int delete(int id);
	
	List<Employee> getAll();
	
	Employee getById(int id);

}
