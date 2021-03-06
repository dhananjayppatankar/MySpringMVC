package com.dhan.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dhan.service.Service1;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@Autowired
	private Service1 service1;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@ModelAttribute
	public String modelMessage(Model model) {
		String a = "This is a header message";
		String b = "This is a Web message";
		model.addAttribute("headermessage", a);
		model.addAttribute("webmessage", b);
		return "hello";
	}
		
	@RequestMapping(value = "add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		int i = Integer.parseInt(req.getParameter("value1"));
		int j = Integer.parseInt(req.getParameter("value2"));
		int result = i + j;

		System.out.println("Hello");
		return new ModelAndView("hello", "result", result);
	}

	@RequestMapping(value = "hello")
	public ModelAndView sayHello() {

		return new ModelAndView("hello", "hellomessage", service1.sayHello());
	}

}
