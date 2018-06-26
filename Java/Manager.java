package Java;

public class Manager {
	BankApp bapp = null;
	public BankApp CreateAcc(char typeofacc,int acc_id, double avai_balance, String cust_name) {
		
		if(typeofacc=='S') {
			bapp = new SavingAccount(acc_id, avai_balance, cust_name);
			
		}else if (typeofacc=='L') {
			bapp=new LoanAcc(acc_id, avai_balance, cust_name);
			
		}
		return bapp;
	}

}
