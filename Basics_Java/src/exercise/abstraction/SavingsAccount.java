package exercise.abstraction;

public class SavingsAccount implements Account {
	private String name;
	private double balance;

	public SavingsAccount(String name, double initialBalance) {
	this.name = name;
	this.balance = initialBalance;
	}

	@Override
	public void withdraw(double amount) {
	if((amount>balance)|| (balance<100)){
	System.out.println("Cannot withdraw low balance");

	}else{
	    balance= balance - amount;
	    System.out.println("Withdrawal $:"+amount);
	    balanceDisplay();
	}
	}

	@Override
	public void deposit(double amount) {
	balance = balance+amount;
	System.out.println("Deposited: $ : "+amount);
	balanceDisplay();
	}

	@Override
	public void balanceDisplay() {
	System.out.println("Balance $:"+balance);

	}
	}
	
