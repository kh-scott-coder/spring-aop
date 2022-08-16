package dev.scott.service;

import org.springframework.stereotype.Service;

import dev.scott.model.Employee;

@Service
public class EmployeeService {
	public Employee createEmployee(Employee employee) {
		System.err.println("02");
		Employee emp = new Employee();
		emp.setEmpId(employee.getEmpId());
		emp.setFirstName(employee.getFirstName());
		emp.setSecondName(employee.getSecondName());
		return emp;
	}

	public void deleteEmployee(String empId) {
	}
}