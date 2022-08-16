package dev.scott.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import dev.scott.model.Account;

@Aspect
@Component
public class AccountAspect {

	@AfterReturning(value = "execution(* dev.scott.service.AccountServiceImpl.*(..))", returning = "account")
	public void afterReturningAdvice(JoinPoint joinPoint, Account account) {
		System.out.println("After Returing method:" + joinPoint.getSignature());
		System.out.println(account);
	}

	@AfterThrowing(value = "execution(* dev.scott.service.AccountServiceImpl.*(..))", throwing = "ex")
	public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex) {
		System.out.println("After Throwing exception in method:" + joinPoint.getSignature());
		System.out.println("Exception is:" + ex.getMessage());
	}

}
