package dev.scott.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
	public String displayBalance(String accNum) {
		System.out.println("Inside displayBalance() method");
		if (accNum.equals("12345")) {
			return "Total balance: 10,000";
		} else {
			return "Sorry! wrong account number.";
		}
	}
}
