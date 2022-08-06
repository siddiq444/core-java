package c2tcprog;

import c2tc.application.MMBankFactory;
import c2tc.framework.BankFactory;
import c2tc.framework.CurrentAcc;
import c2tc.framework.SavingAcc;

public class client {

	public static void main(String[] args) {
		BankFactory sf=new MMBankFactory();
		SavingAcc pa=new SavingAcc(1122, "SID",50 );
		pa.withdraw(1950);
		CurrentAcc na=new CurrentAcc(2211,"zabi",50);
		na.withdraw(100);
	}

}
