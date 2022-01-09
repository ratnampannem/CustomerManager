package net.codejava.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InboxController {

	@RequestMapping("/inbox")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("inbox");
		mav.addObject("message", " Inbox Message......");
		return mav;
		
	}
	@RequestMapping("/getdept")
	public ModelAndView getdept() {
		ModelAndView mav = new ModelAndView("inbox");
		mav.addObject("message", " Getting department data......");
		return mav;
		
	}
	
	
}
