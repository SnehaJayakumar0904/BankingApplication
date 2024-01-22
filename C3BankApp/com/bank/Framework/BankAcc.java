package com.bank.Framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public int getAccNo() 
	{
		return accNo;
	}
	
	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}
	
	public String getAccNm() 
	{
		return accNm;
	}
	
	public void setAccNm(String accNm) 
	{
		this.accNm = accNm;
	}
	
	public float getAccBal() 
	{
		return accBal;
	}
	
	public void setAccBal(float accBal) 
	{
		this.accBal = accBal;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account Type : Savings Account");
		System.out.println("Account Holder Name : "+getAccNm());
		System.out.println("Account Number : "+getAccNo());
		System.out.println("Account Balance : Rs "+accBal);
	}
	public void deposite(float accBal)
	{
		System.out.println("The available Account Balance : Rs "+accBal);
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
