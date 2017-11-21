package com.dhan.spring;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhan.model.Employee;

@Controller
public class EmployeeController {

	
	@RequestMapping("/employeeform")
	public String employeecontroller() {
	
		return "employeeform";
		
	}
	
	@RequestMapping(value="employeeSuccess", method=RequestMethod.POST)
	public String employeeFormSuccess(@RequestParam ("ename") String ename, @RequestParam("address") String address, @RequestParam("salary") String salary, @RequestParam("date") Date date) {
		
		Employee emp = new Employee();
		emp.setAddress(address);
		emp.setDate(date);
		emp.setEname(ename);
		//add employee to employee bean
		return "redirect:listemployees";
	}
	
	@RequestMapping(value="/listemployees")
	public String listEmployees() {
		
		return "listemployees";
	}
	
	
}
