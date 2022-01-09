package net.codejava.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/emp")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("employee");
		List<Employee> emplList = employeeService.listAll();
		mav.addObject("message", "Hello Employee How are you ggggggggg");
		return mav;
	}
	
	/**@RequestMapping("/showemp")
	public ModelAndView showemp() {
		ModelAndView mav = new ModelAndView("employee");
		mav.addObject("message", "Hello Showing Employee deatils");
		return mav;
	}
	
	@RequestMapping("/getemp")
	public ModelAndView getemp() {
		ModelAndView mav = new ModelAndView("employee");
		mav.addObject("message", "Geting Employee deatils");
		return mav;
	}
	*/
	
	
	

}
