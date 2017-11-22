package com.dhan.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dhan.model.Employee;

@Repository
public class EmployeeDao {

	private static List<Employee> list = new ArrayList<Employee>();
	static {

		list.add(new Employee( "dhanEmp", "490 Tolland Street", 1800, new Date()));
		list.add(new Employee( "dhanEmp2", "4901 Tolland Street", 2800, new Date()));
		list.add(new Employee( "dhanEmp3", "4902 Tolland Street", 3800, new Date()));
		list.add(new Employee("dhanEmp4", "4903 Tolland Street", 4800, new Date()));
		list.add(new Employee( "dhanEmp5", "4904 Tolland Street", 5800, new Date()));

	}

	public List<Employee> getAllEmployees() {

		return list;

	}

	public void createEmployee(Employee employee) {
		list.add(employee);

	}
 
}
