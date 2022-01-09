package net.codejava.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping("/asdf")
	public ModelAndView homep() {
		ModelAndView mav = new ModelAndView("index");
		List<Customer> listCustomer = customerService.listAll();
		mav.addObject("listCustomerTest123", listCustomer);
		
		for(Customer c : listCustomer)
		{
			
		}
		return mav;
	}

}
