package com.dhan.spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Even we can use Controller and AbstarctController Interface 
// Make use of HttpSErvlet request and response object


@Controller
public class UserController {

	@RequestMapping(value = "/listusers")
	public ModelAndView listUsers() {

		return new ModelAndView("listuser", "listuser", "List of users is displayed");

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
}
