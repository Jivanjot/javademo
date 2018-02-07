package org.niit.demo.multithread.synchronize;

public class Account {
	
	private int balance;
	public Account(int balance)
	{
		this.balance=balance;
	}
	
	public synchronized void withdraw(int amount)
	{
		balance=balance-amount;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After withdraw"+amount+"the balance is "+balance);
	}
	public synchronized void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("After deposit"+amount+"the balance is "+balance);

		
	}

}
