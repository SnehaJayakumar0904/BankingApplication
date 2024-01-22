package com.bank.Application;

import com.bank.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static final float MINBAL=10;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account Type : Savings Account");
		System.out.println("Account Holder Name : "+getAccNm());
		System.out.println("Account Number : "+getAccNo());
		System.out.println("Account Balance : Rs "+accBal);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
