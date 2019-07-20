package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	List<Account> accounts = new ArrayList<>(Arrays.asList(
			new Account("15050020345642342", "8889996568", "AXIS BANK", "10,50,000", "SHAHJADE ALAM"),
			new Account("6543983739282", "8269569738", "ICICI BANK", "50,000", "ASHISH KHATRI")
			));
	
	public Account getAccountDetails(String mobileNumber)
	{
	
	return accounts.stream().filter(a->a.getMobileNumber().equals(mobileNumber)).findFirst().get();
	}
}
