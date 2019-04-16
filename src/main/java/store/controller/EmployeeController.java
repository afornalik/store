package store.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import store.model.Employee;

@Controller
@RequestMapping(path = "/store")
public class EmployeeController {

	public String saveEmployee(Model model,Employee employee) {
		System.out.println("first name : "+ employee.getFirstName());
		System.out.println("last name : "+ employee.getLastName());
		System.out.println("salary : "+ employee.getSalary());
		
		model.addAttribute(employee);
		return "display";
	}

}
