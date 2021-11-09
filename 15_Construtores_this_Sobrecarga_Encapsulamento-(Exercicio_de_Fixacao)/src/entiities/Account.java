package entiities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.00;
	}

	public int getNumber() {
		return number;
	}

	// Numero da Conta não pode ser alterado
	/*
	public void setNumber(int number) {
		this.number = number;
	} 
	*/

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	// Balance nao pode ser alterado por meio de getttes e setters 
	/*
	public void setBalance(double balance) {
		this.balance = balance;
	}
	*/
	
	@Override
	public String toString() {
		return "Account " + number + ", "
			 + "Holder: " + holder + ", "
			 + "Balance: " + String.format("%.2f", balance);
	}

}
