package com.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerUI {
	@RequestMapping("/sendData")
	public ModelAndView Hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		
		mv.addObject("id", 23);
		mv.addObject("name", "Andy");
		
		return mv;
	}
}
