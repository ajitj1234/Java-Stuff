package Java;

public class SavingAccount implements BankApp {

	int Acc_id;
	double avai_balance;
	String Cust_name;
	
	public SavingAccount(int acc_id, double avai_balance, String cust_name) {
		
		Acc_id = acc_id;
		this.avai_balance = avai_balance;
		Cust_name = cust_name;
	}
	
	public void deposite(double amount) {
		avai_balance= avai_balance+amount;
		System.out.println("your balance is "+avai_balance);
		
	}
	
	public void withdraw(double amount) {
		avai_balance= avai_balance-amount;
		System.out.println("your balance is "+avai_balance);
		
	}
	
	public void checkbal() {
		System.out.println(avai_balance);
		
	}



}
