package org.niit.demo.userdefined;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account ac=new Account();
		
		try
		{
			ac.withdraw(13000);
			System.out.println("available balance ");
		}
		catch(MinimumBalance e)
		{
			System.out.println("Minimum should be 10000");
		}
		
	}

}
