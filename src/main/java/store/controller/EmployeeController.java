package store.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/store")
public class EmployeeController {

	public String saveEmployee(ServletRequest request) {
		
		return "display";
	}

}
