package org.niit.demo.userdefined;

public class Account {
	
	private int Balance =13000;
	public void withdraw(int amount) throws MinimumBalance 
	{
		Balance=Balance-amount;
		if(Balance<10000)
		{
			throw new MinimumBalance();
		}
	}

}
