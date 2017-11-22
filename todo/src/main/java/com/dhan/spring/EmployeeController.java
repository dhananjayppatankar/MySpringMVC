package com.dhan.spring;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dhan.model.Employee;
import com.dhan.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "date", new CustomDateEditor(dateFormat, true));
		
	}
	
	
	
	@RequestMapping("/employeeform")
	public String employeecontroller() {
	
		return "employeeform";
		
	}
	
	@RequestMapping(value="employeeSuccess", method=RequestMethod.POST)
	public String employeeFormSuccess(@RequestParam ("ename") String ename, @RequestParam("address") String address, @RequestParam("salary") int salary, @RequestParam("date") Date date) {
		
		Employee emp = new Employee();
		emp.setAddress(address);
		emp.setSalary(salary);
		emp.setDate(date);
		emp.setEname(ename);

		employeeService.createEmployee(emp);
		return "redirect:listemployees";
	}
	
	@RequestMapping(value="/listemployees")
	public ModelAndView listEmployees(ModelAndView mv) {
	
	List<Employee>	employeeList = employeeService.getAllEmployees();
	System.out.println(employeeList);	
	mv.addObject(employeeList);
		mv.setViewName("employeedisplay");
		return mv;
	}
	
	
}
