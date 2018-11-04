package entities;

public class Account {
	private int count;
	private double balance;
	private String name;
	
	public Account(int count, String name) {
		this.count = count;
		this.name  = name;
	}
	
	public Account(int count, String name, double initialCredit) {
		this.count = count;
		this.name  = name;
		addCredit(initialCredit);
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void addCredit(double credit) {
		this.balance += credit;	
		
	}
	
	public void addDebit(double debit) {
		this.balance -= debit + 5.0;	
		
	}
	
}

