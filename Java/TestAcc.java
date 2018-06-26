package Java;

public class TestAcc {

	public static void main(String[] args) {
		Manager mgr = new Manager();
		BankApp bapp1 = mgr.CreateAcc('S', 420, 50000, "ajit");
		
		bapp1.checkbal();
		bapp1.deposite(5000);
		bapp1.checkbal();
		bapp1.withdraw(6000);
		

	}

}
