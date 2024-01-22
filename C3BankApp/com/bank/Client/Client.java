package com.bank.Client;

import com.bank.Application.MMBankFactory;
import com.bank.Application.MMCurrentAcc;
import com.bank.Application.MMSavingAcc;
import com.bank.Framework.BankFactory;
import com.bank.Framework.CurrentAcc;
import com.bank.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory Bf = new MMBankFactory();
		
		SavingAcc Sa = new MMSavingAcc(527,"Sneha",80000, true);
		Sa.withdraw(Sa.getAccBal());
		Sa.toString();
		
		CurrentAcc na = new MMCurrentAcc(501,"JS",2000,1334);
		na.withdraw(na.getCreditLimit());
		na.toString();

	}

}
