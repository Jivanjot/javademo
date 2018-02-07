package org.niit.demo.interfaces;

public class CurrentAcc extends AbstractClass{

	
	public void openAcc() {
		System.out.println("open in curent ");
		
	}

	
	public void closeAcc() {
		System.out.println("close in saving ");
		
	}

	
	

	
	public int debitAcc(int y) {
		System.out.println("debited from current ");
		return y;
	}

	
	
	
}
