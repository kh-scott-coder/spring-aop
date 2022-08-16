package dev.scott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.scott.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bankService;

	@RequestMapping(value = "/bank/test", method = RequestMethod.GET)
	public String test(@RequestParam("accountNo") String accountNo) {
		return bankService.displayBalance(accountNo);
	}
}
