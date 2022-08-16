package dev.scott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AOPApplication {
	public static void main(String[] args) {
		SpringApplication.run(AOPApplication.class, args);
	}
}
