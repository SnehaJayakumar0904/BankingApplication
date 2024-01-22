package com.bank.Application;

import com.bank.Framework.BankFactory;

import com.bank.Framework.CurrentAcc;
import com.bank.Framework.SavingAcc;


public  class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc savingAcc = new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return savingAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc currentAcc = new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return currentAcc;
	}

}
