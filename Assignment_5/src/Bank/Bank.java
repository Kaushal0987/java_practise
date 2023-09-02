package Bank;

abstract class Bank {
	abstract void getBalance();
}

class BankA extends Bank{
	void getBalance() {
		System.out.println("Balance: $100");
	}
}

class BankB extends Bank{
	void getBalance() {
		System.out.println("Balance: $150");
	}
}

class BankC extends Bank{
	void getBalance() {
		System.out.println("Balance: $200");
	}
}