package dev.scott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.scott.model.Account;
import dev.scott.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/account/cif", method = RequestMethod.GET)
	public Account getAccountByCustomerId(@RequestParam("accountNo") String accountNo) {
		try {
			Account account = accountService.getAccountByCustomerId(null);
			if (account != null)
				return account;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;

	}
}
