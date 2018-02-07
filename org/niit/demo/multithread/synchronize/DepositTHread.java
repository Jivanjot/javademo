package org.niit.demo.multithread.synchronize;

public class DepositTHread extends Thread {

	private Account account;
	private int amount;
	
	public DepositTHread(Account account,int amount)
	
	{
	   this.account=account;
	   this.amount=amount;
	}
	public void run()
	{
       account.deposit(amount);
     	}
	
}
