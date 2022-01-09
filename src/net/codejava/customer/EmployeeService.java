package net.codejava.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepositary employeeRepositary;

	public List<Employee> listAll() {
		List<Employee> empList =(List<Employee>) employeeRepositary.findAll();
		return  empList;
	}
	
	 
}
