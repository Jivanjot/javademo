package org.niit.demo.multithreading;

public class TestInterface {
	
	public static void main(String[] args) {
		
		MyThreadInterface q=new MyThreadInterface();
		Thread a=new Thread(q);
		a.start();
		for(int i=0;i<=2000;i=i+3)
		{
			System.out.println(i);
		}
		
	}

}
