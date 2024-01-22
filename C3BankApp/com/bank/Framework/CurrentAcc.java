package com.bank.Framework;

public abstract class CurrentAcc extends BankAcc{
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
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
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	


}
