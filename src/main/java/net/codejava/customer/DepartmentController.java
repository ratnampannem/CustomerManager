package net.codejava.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentController {
	
	@RequestMapping("/dept")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("department");
		mav.addObject("message", " Hello Department.......... ");
		return mav;
	}
	
	

}
