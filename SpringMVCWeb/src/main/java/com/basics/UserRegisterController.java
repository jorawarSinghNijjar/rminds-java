package com.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserRegisterController {
//	
//	@RequestMapping("/user/register")
//	public ModelAndView getUserRegisterPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("userRegistration");
//		
//		return mv;
//	}
	
	// Second way to handle request mapping
	@RequestMapping("/user/register")
	public String getUserRegisterPage() {
		return "userRegistration";
	}
	
	@RequestMapping(value= "/user/register", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user ) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		System.out.println(user);
		return mv;
	}
	
}
