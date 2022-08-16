package dev.scott.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAspect {
	@Pointcut(value = "execution(* dev.scott.service.BankService.*(..))")
	private void logDisplayingBalance() {
	}

	@Around(value = "logDisplayingBalance()")
	public String aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(
				"The method aroundAdvice() before invokation of the method " + jp.getSignature().getName() + " method");
		try {
			jp.proceed();
		} finally {

		}
		System.out.println(
				"The method aroundAdvice() after invokation of the method " + jp.getSignature().getName() + " method");
		return jp.proceed().toString();
	}
}
