package store.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import store.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(path ="/add", method=RequestMethod.POST )
	public String saveEmployee(Model model,Employee employee) {
		System.out.println("first name : "+ employee.getFirstName());
		System.out.println("last name : "+ employee.getLastName());
		System.out.println("salary : "+ employee.getSalary());
		
		model.addAttribute(employee);
		return "display";
	}
	
	@RequestMapping(path="/*",method=RequestMethod.GET)
	public String index(Model model) {
		return "emp";
	}

}
