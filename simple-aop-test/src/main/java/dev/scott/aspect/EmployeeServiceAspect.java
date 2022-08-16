package dev.scott.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import dev.scott.model.Employee;

@Aspect
@Component
public class EmployeeServiceAspect {
	@Before(value = "execution(* dev.scott.service.EmployeeService.*(..)) and args(employee)")
	public void beforeAdvice(JoinPoint joinPoint, Employee employee) {
		employee.setEmpId("0003");
		System.err.println("03");
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with first name - " + employee.getFirstName() + ", second name - "
				+ employee.getSecondName() + " and id - " + employee.getEmpId());
	}

	@After(value = "execution(* dev.scott.service.EmployeeService.*(..)) and args(employee)")
	public void afterAdvice(JoinPoint joinPoint, Employee employee) {
		System.err.println("04");
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with first name - " + employee.getFirstName() + ", second name - "
				+ employee.getSecondName() + " and id - " + employee.getEmpId());
	}
}