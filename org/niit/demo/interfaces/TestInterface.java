package org.niit.demo.interfaces;

public class TestInterface {

	public static void main(String[] args) {
		
	SavingAcc sa=new SavingAcc();
	CurrentAcc ca=new CurrentAcc();
	
		
	sa.openAcc();
	sa.closeAcc();
	sa.creditAcc(100);
	sa.debitAcc(50);
		
	ca.openAcc();
	ca.closeAcc();
  ca.creditAcc(200);
    ca.debitAcc(20);
	}
	
	
	
}
