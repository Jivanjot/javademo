package org.niit.demo.multithread.synchronize;

public class TestAccount {

	public static void main(String[] args) {
		
		Account ac=new Account(20000);
	    WithdrawThread w1=new WithdrawThread(ac,1000);
	    w1.start();
	    
	    DepositTHread d1=new DepositTHread(ac,2000);
	    d1.start();
	    
	    WithdrawThread w2=new WithdrawThread(ac,2000);
	    w2.start();
	    
	    DepositTHread d2=new DepositTHread(ac,3000);
	    d2.start(); 
	    
	    
	    WithdrawThread w3=new WithdrawThread(ac,4000);
	    w3.start();
	    
	    DepositTHread d3=new DepositTHread(ac,4000);
	    d3.start();
	    
	    WithdrawThread w4=new WithdrawThread(ac,5000);
	    w4.start();
	    
	    DepositTHread d4=new DepositTHread(ac,2000);
	    d4.start(); 
	    
		
		
	}
}
