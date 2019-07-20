package com.example.demo;

public class Account {
	
	private String accountNumber;
	private String mobileNumber;
	private String bankName;
	private String balance;
	private String accountHolderName;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Account(String accountNumber, String mobileNumber, String bankName, String balance,
			String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.bankName = bankName;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
	
	

}
