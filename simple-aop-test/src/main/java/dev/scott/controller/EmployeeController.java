package dev.scott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.scott.model.Employee;
import dev.scott.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public Employee addEmployee(@RequestBody Employee employee) {
		System.err.println("01");
		return employeeService.createEmployee(employee);
	}

	@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
	public String removeEmployee(@RequestParam("empId") String empId) {
		employeeService.deleteEmployee(empId);
		return "Employee removed";
	}
}