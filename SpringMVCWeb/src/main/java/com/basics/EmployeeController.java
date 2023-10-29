package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("/empData")
	public ModelAndView hello(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employees");
		Employee emp1 = new Employee();
		emp1.setId(23);
		emp1.setName("Ajay");
		emp1.setSalary(36200);
		
		Employee emp2 = new Employee();
		emp2.setId(24);
		emp2.setName("Deppak");
		emp2.setSalary(38400);
		
		Employee emp3 = new Employee();
		emp3.setId(26);
		emp3.setName("Zyng");
		emp3.setSalary(15600);
		
		List<Employee> list = new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3));
	
		mv.addObject("list",list);
		
		return mv;
	}
}
