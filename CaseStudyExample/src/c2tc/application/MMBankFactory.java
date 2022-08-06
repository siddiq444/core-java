package c2tc.application;

import c2tc.framework.BankFactory;
import c2tc.framework.CurrentAcc;
import c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory   {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal) {
		SavingAcc pa=new SavingAcc(accNo, accNm, accBal);
		return pa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal) {
		CurrentAcc na=new CurrentAcc(accNo, accNm, accBal);
		return na;
	}



	
}
