package org.niit.demo.interfaces;

public class SavingAcc extends AbstractClass {

	
	public void openAcc() {
		
		System.out.println("open in saving ");
	}

	
	public void closeAcc() {
		System.out.println("close in saving ");
		
	}


	

	
	public int debitAcc(int y) {
		System.out.println( y+" is debited from saviing ");
		return y;
	}

	
	
	
}
