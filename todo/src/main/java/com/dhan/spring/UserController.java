package com.dhan.spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dhan.model.User;
import com.dhan.service.UserService;

//Even we can use Controller and AbstarctController Interface 
// Make use of HttpSErvlet request and response object


@Controller
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping(value = "/listusers")
	public ModelAndView listUsers(ModelAndView modelAndView) {
		modelAndView.setViewName("userdisplay");
		List<User> userList = userservice.getUserList();
		modelAndView.addObject("userList", userList);
		return modelAndView;
	}
	
	@RequestMapping(value="/welcome/{username}/{age}")
	public ModelAndView welcomeUser(@PathVariable("username") String username,@PathVariable("age") String age) {
		
		return new ModelAndView("listuser","welcome","We welcome Mr."+ username + " and his age is " + age);
	}

	@RequestMapping(value="/path/map/{username}/{age}/{country}")
	public ModelAndView countryUser(@PathVariable Map<String, String> pathMap)  {
		String username =pathMap.get("username");
		int age = Integer.parseInt(pathMap.get("age"));
		String country = pathMap.get("country");
		return new ModelAndView("countryuser","countryuser","Welcome user "+ username + " your age is " + age +" you are from  " + country);
		
	}
	
	@RequestMapping(value="/userform")
	public ModelAndView userForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userform");
		return mv;
	}
	
	@RequestMapping(value="/enter")
	public ModelAndView userFormInput(@RequestParam("name") String name,@RequestParam("email") String email, @RequestParam("age") int age, @RequestParam("country") String country ) {
		
		User user = new User(name,email,age,country);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("userdisplay");
		return mv;
		
	}
	
	@RequestMapping(value="/enter1")
	public ModelAndView userFormMapInput(@RequestParam Map<String,String> requestMap) {
		User user = new User(requestMap.get("name"), requestMap.get("email"), Integer.parseInt(requestMap.get("age")),requestMap.get("country"));
		ModelAndView mv= new ModelAndView();
		mv.addObject(user);
		mv.setViewName("userdisplay");
		return mv;
		
	}
	
	
}
