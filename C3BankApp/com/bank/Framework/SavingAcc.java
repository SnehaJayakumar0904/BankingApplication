package com.bank.Framework;

public abstract class SavingAcc extends BankAcc 
{
    private boolean isSalary;
    private static final float MINBAl = 100;
        
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
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
		return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
