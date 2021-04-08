package com.loan.education.doa;

import com.loan.education.controller.UserValidation;

public class Amount {
	public int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}	
	public void amountValidation() {
		UserValidation usr = new UserValidation();
		usr.validateAmount(amount);
	}
}

