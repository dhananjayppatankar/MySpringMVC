package com.dhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dhan.dao.EmployeeDao;
import com.dhan.model.Employee;

@Component 
public class EmployeeService {

	
	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployees(){
		
		return employeeDao.getAllEmployees();
	}
	
	public void createEmployee(Employee employee) {
		employeeDao.createEmployee(employee);
		
	}
	
	
	
}
