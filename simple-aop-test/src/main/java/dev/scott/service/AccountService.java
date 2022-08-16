package dev.scott.service;

import dev.scott.model.Account;

public interface AccountService {
	public abstract Account getAccountByCustomerId(String customerId) throws Exception;
}
