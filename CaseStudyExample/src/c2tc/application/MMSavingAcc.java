package c2tc.application;

import c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float charges) {
		System.out.println("Withdraw Amount"+charges);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}
	
}
