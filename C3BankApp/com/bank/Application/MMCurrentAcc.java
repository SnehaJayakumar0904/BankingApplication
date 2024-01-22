package com.bank.Application;

import com.bank.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	


	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	public void withdraw(float accBal)
	{
		System.out.println("Account Type : Current Account");
		System.out.println("Account Holder Name : "+getAccNm());
		System.out.println("Account Number : "+getAccNo());
		System.out.println("Current Balance is : "+getAccBal()+" and The Credit Limit is : "+getCreditLimit());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
