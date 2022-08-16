package dev.scott.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
	private String accountNumber;
	private String accountType;
}
