package Bank;

public class MainBank {
	public static void main(String [] args) {
		BankA b1 = new BankA();
		BankB b2 = new BankB();
		BankC b3 = new BankC();
		
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}
}
