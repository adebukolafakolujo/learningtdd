package com.account;

public class Account {
	
	private int accountBalance;

	public void depositMoney(int amount) {
		if(amount >= 0)
		accountBalance += amount;
		
		
	}

	public int getAccountBalance() {
		
		return accountBalance;
	}

	public void WithdrawCash(int cashWithdrawal) {
		accountBalance -= cashWithdrawal;
		
		
	}

}
